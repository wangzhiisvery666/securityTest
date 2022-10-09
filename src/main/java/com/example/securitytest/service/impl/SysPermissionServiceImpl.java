package com.example.securitytest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.securitytest.domain.SysPermission;
import com.example.securitytest.service.SysPermissionService;
import com.example.securitytest.mapper.SysPermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author o'k
* @description 针对表【sys_permission(权限表)】的数据库操作Service实现
* @createDate 2022-10-08 18:28:37
*/
@Service
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission>
implements SysPermissionService{

}
