package com.example.securitytest.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.securitytest.domain.Actor;
import com.example.securitytest.domain.SysUser;
import com.example.securitytest.domain.SysUserDetails;
import com.example.securitytest.mapper.SysPermissionMapper;
import com.example.securitytest.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 实现jdbc 验证
 */
@Component
public class SysUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Autowired
    SysPermissionMapper sysPermissionMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        LambdaQueryWrapper<SysUser> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        userLambdaQueryWrapper.eq(SysUser::getUserName,username);
        SysUser sysUser = sysUserMapper.selectOne(userLambdaQueryWrapper);
        Integer id = sysUser.getId();
        List<String> permissions = sysPermissionMapper.getPermissionById(id);

        //把信息封装成Details 交给 security
        return new SysUserDetails(sysUser, permissions);
    }
}
