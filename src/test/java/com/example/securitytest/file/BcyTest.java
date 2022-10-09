package com.example.securitytest.file;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class BcyTest {
    @Autowired
    PasswordEncoder bcy;

    @Test
    public  void getPassword(){
        String encode = bcy.encode("123");
        System.out.println(encode);
    }
}
