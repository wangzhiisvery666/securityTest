package com.example.securitytest.file;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Component
public class JwtFilter extends OncePerRequestFilter {


        @Override
        protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
            //获取token
            String token = request.getHeader("token");
            if (!StringUtils.hasText(token)) {
                //放行
                filterChain.doFilter(request, response);
                return;
            }
            //解析token
            //从redis中获取用户信息
            String redisKey = "login:admin";

//            if(Objects.isNull(loginUser)){
//                throw new RuntimeException("用户未登录");
//            }
            //存入SecurityContextHolder
            //TODO 获取权限信息封装到Authentication中
//            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(loginUser,null,null);
//            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            //放行
            filterChain.doFilter(request, response);
        }
    }
