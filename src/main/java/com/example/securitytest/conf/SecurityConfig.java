package com.example.securitytest.conf;

import com.example.securitytest.service.impl.AuthenticationEntryPointImpl;
import com.example.securitytest.file.JwtFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//Security的配置类

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity  //开启全局注解方法 限权
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    JwtFilter jwtFilter;

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    AuthenticationEntryPointImpl authenticationEntryPoint;

    //注入给IOC 用于Security对密码的加密解密
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //跨站请求伪造 不用开启 前后端分离项目 天然抵抗该攻击
        http
                .csrf().disable()
                //不使用session
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                //  拦截器先于 拦截器执行 所以要路径保持一直  对于登录接口 允许匿名访问
                .antMatchers("/login").anonymous()
                .and().authorizeRequests()
                // 除上面外的所有请求全部需要鉴权认证
                .anyRequest().authenticated();

        //  加入过滤器 进行 过滤
        http.addFilterBefore( jwtFilter, UsernamePasswordAuthenticationFilter.class);

        //配置异常处理器
        http.exceptionHandling()
                //配置认证失败处理器
                .authenticationEntryPoint(authenticationEntryPoint);

    }

    /**
     *     把jdbc验证加入到security控制  没有这个嗷嗷报错
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);

    }

    /**
     * 注入AuthenticationManager 需要依赖他的 authenticate() 来验证用户名密码
     * @return : 注入AuthenticationManager
     * @throws Exception
     */
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

}
