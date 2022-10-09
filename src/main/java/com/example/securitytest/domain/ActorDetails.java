package com.example.securitytest.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.example.securitytest.domain.Actor;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 框架所使用的UserDetails 类型所以要 把自己的user封装到其中
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActorDetails implements UserDetails {

    private SysUser sysUser;

    //权限
    private List<String> permissions;

    //权限信息
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        //把permissions中字符串类型的权限信息转换成GrantedAuthority对象存入authorities中
        return permissions.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return sysUser.getPassword();
    }

    @Override
    public String getUsername() {
        return sysUser.getUserName();
    }

    //没过过期
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    //没被锁
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    //凭证未过期
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    //已开启
    @Override
    public boolean isEnabled() {
        return true;
    }
}
