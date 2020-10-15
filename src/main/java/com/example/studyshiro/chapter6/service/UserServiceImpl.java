package com.example.studyshiro.chapter6.service;

import com.example.studyshiro.chapter6.dao.UserDao;
import com.example.studyshiro.chapter6.dao.UserDaoImpl;
import com.example.studyshiro.chapter6.entity.User;

import java.util.Set;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();
    private PasswordHelper passwordHelper = new PasswordHelper();

    @Override
    public User createUser(User user) {
        return userDao.createUser(user);
    }

    @Override
    public void changePassword(Long userId, String newPassword) {
        User user = userDao.findOne(userId);
        user.setPassword(newPassword);
        userDao.updateUser(user);
    }

    @Override
    public void correlationRoles(Long userId, Long... roleIds) {

    }

    @Override
    public void uncorrelationRoles(Long userId, Long... roleIds) {

    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public Set<String> findRoles(String username) {
        return null;
    }

    @Override
    public Set<String> findPermissions(String username) {
        return null;
    }
}
