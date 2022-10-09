package com.example.securitytest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUserDetails implements UserDetails {

    private SysUser sysUser;

    private List<String> permissions;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
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
