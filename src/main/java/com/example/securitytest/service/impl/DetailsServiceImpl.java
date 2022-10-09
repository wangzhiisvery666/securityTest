//package com.example.securitytest.service.impl;
//
//import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
//import com.example.securitytest.domain.Actor;
//import com.example.securitytest.domain.ActorDetails;
//import com.example.securitytest.mapper.ActorMapper;
//import com.example.securitytest.mapper.SysPermissionMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class DetailsServiceImpl implements UserDetailsService {
//
//    @Autowired
//    SysPermissionMapper sysPermissionMapper;
//
//    @Autowired
//    ActorMapper actorMapper;
//
//    //TODO  3、第二步 重写security 的自动缓存 改成自己的查询数据库
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        //通过用户名来查找
//        LambdaQueryWrapper<Actor> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
//        userLambdaQueryWrapper.eq( Actor::getUsername,username);
//        Actor admin = actorMapper.selectOne(userLambdaQueryWrapper);
//        Integer id = admin.getId();
//
//        List<String> permissionById = sysPermissionMapper.getPermissionById(id);
//
//        //把自己的用户信息封装到Details中
//        return new ActorDetails(admin,permissionById);
//    }
//}
