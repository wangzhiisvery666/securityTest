package com.example.securitytest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.securitytest.domain.Actor;
import com.example.securitytest.service.ActorService;
import com.example.securitytest.mapper.ActorMapper;
import org.springframework.stereotype.Service;

/**
* @author o'k
* @description 针对表【actor】的数据库操作Service实现
* @createDate 2022-10-07 15:54:24
*/
@Service
public class ActorServiceImpl extends ServiceImpl<ActorMapper, Actor>
implements ActorService{

}
