package com.example.securitytest.service;


import com.example.securitytest.domain.SysUser;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
     SysUser login(String username , String password);
}
