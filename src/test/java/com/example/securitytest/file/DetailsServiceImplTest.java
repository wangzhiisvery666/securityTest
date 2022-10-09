package com.example.securitytest.file;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.securitytest.domain.Actor;
import com.example.securitytest.mapper.ActorMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DetailsServiceImplTest {

    @Autowired
    ActorMapper actorMapper;

    @Test
    void loadUserByUsername() {

        LambdaQueryWrapper<Actor> actorLambdaQueryWrapper = new LambdaQueryWrapper<>();
        actorLambdaQueryWrapper.eq(Actor::getUsername, "小兰");
        Actor actor = actorMapper.selectOne(actorLambdaQueryWrapper);
        Integer id = actor.getId();
        String username = actor.getUsername();
        String password = actor.getPassword();
        System.out.println(id);
        System.out.println(username);
        System.out.println(password);
    }
}