package com.example.studyshiro.chapter6.service;


import com.example.studyshiro.chapter6.entity.Permission;

public interface PermissionService {
    public Permission createPermission(Permission permission);
    public void deletePermission(Long permissionId);
}
