package com.example.studyshiro.chapter3.permission;

import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.permission.PermissionResolver;
import org.apache.shiro.authz.permission.WildcardPermission;

public class BitAndWildPermissionResolver implements PermissionResolver {

    @Override
    public Permission resolvePermission(String s) {
        if(s.startsWith("+")) {
            return new BitPermission(s);
        }
        return new WildcardPermission(s);
    }
}
