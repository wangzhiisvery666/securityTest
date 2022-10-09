package com.example.securitytest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.securitytest.domain.SysPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
* @author o'k
* @description 针对表【sys_permission(权限表)】的数据库操作Mapper
* @createDate 2022-10-08 18:28:37
* @Entity com.example.securitytest.domain.SysPermission
*/
@Mapper
public interface SysPermissionMapper extends BaseMapper<SysPermission> {

    List<String> getPermissionById(@Param("userId") Integer id);

}
