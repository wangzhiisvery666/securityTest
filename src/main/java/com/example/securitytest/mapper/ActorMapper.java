package com.example.securitytest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.securitytest.domain.Actor;
import org.apache.ibatis.annotations.Mapper;

/**
* @author o'k
* @description 针对表【actor】的数据库操作Mapper
* @createDate 2022-10-07 15:54:24
* @Entity generator.domain.Actor
*/
@Mapper
public interface ActorMapper extends BaseMapper<Actor> {

}
