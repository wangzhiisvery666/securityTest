package com.example.securitytest.cotroller;

import com.example.securitytest.domain.SysUser;
import com.example.securitytest.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    LoginServiceImpl loginService;

    @PostMapping("login")
    public SysUser login(String username, String password){
        // TODO: 2022/10/8  第一步
        return loginService.login(username,password);
    }

    @GetMapping("/A1")
    @PreAuthorize("hasPermission('create_user')")
    public   String   ant(){
        return  "您拥有权限:create_user";
    }

}
