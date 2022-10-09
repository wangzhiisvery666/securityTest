package com.example.securitytest.mapper;

import com.example.securitytest.domain.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author o'k
* @description 针对表【sys_user(用户表)】的数据库操作Mapper
* @createDate 2022-10-08 23:24:09
* @Entity com.example.securitytest.domain.SysUser
*/
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}




