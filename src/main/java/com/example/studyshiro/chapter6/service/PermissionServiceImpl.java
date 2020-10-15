package com.example.studyshiro.chapter6.service;

import com.example.studyshiro.chapter6.dao.PermissionDao;
import com.example.studyshiro.chapter6.dao.PermissionDaoImpl;
import com.example.studyshiro.chapter6.entity.Permission;

public class PermissionServiceImpl implements PermissionService {

    private PermissionDao permissionDao = new PermissionDaoImpl();

    @Override
    public Permission createPermission(Permission permission) {
        return permissionDao.createPermission(permission);
    }

    @Override
    public void deletePermission(Long permissionId) {
        permissionDao.deletePermission(permissionId);
    }
}
