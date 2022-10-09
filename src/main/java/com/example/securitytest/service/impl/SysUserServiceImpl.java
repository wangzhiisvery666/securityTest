package com.example.securitytest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.securitytest.domain.SysUser;
import com.example.securitytest.service.SysUserService;
import com.example.securitytest.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
* @author o'k
* @description 针对表【sys_user(用户表)】的数据库操作Service实现
* @createDate 2022-10-08 23:24:09
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




