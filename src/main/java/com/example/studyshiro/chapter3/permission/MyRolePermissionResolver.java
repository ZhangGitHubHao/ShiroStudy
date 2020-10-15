package com.example.studyshiro.chapter3.permission;

import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.permission.RolePermissionResolver;
import org.apache.shiro.authz.permission.WildcardPermission;

import java.util.Arrays;
import java.util.Collection;

public class MyRolePermissionResolver implements RolePermissionResolver {
    @Override
    public Collection<Permission> resolvePermissionsInRole(String s) {
        if("role1".equals(s)) {
            return Arrays.asList((Permission)new WildcardPermission("menu:*"));
        }
        return null;
    }
}
