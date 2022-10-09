package com.example.securitytest.file;

import com.example.securitytest.service.impl.LoginServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LoginServiceImplTest {
    @Autowired
    LoginServiceImpl loginServiceImpl;

    @Test
    void login() {
    }

    /**
     *  测试 权限查询
     */
    @Test
    void getPermissions() {
        List<String> permissions = loginServiceImpl.getPermissions(1);
        permissions.forEach(System.out::println);

    }
}