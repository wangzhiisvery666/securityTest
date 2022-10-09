package com.example.securitytest.service.impl;

import com.example.securitytest.domain.SysUser;
import com.example.securitytest.domain.SysUserDetails;
import com.example.securitytest.mapper.SysPermissionMapper;
import com.example.securitytest.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class LoginServiceImpl implements LoginService {


    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    SysPermissionMapper sysPermissionMapper;

    public SysUser login(String username , String password){
        //封装 管理员对象
        // TODO 1、 第一步  用户请求发到这
        //封装 UsernamePasswordAuthenticationToken
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username,password);

        Authentication authenticate = authenticationManager.authenticate(authenticationToken);


        // TODO 2、第二步  ProviderManage  的 authenticate 继续调用
        //  DaoAuthenticateManageProvider 的 authenticate   然后调用 loadUserByUsername() 这自己重写 了查数据库等操作
        //如果为空 抛出异常
        if (Objects.isNull(authenticate)){
            throw new RuntimeException("失败");
        }

        // TODO 4、有返回到自己写的接口 返回 UserDetails  进行自己的操作
        SysUserDetails sysUserDetails =(SysUserDetails) authenticate.getPrincipal();


        //TODO  可以返回JWT 和保存用户信息
        return sysUserDetails.getSysUser();

        //获取 自己的user 对象



    }


    public List<String> getPermissions(Integer id){
        return  sysPermissionMapper.getPermissionById(id);
    }


}
