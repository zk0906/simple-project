package com.zk.ssmdemo.service.impl;

import com.zk.ssmdemo.dao.UserDao;
import com.zk.ssmdemo.entity.User;
import com.zk.ssmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }
}
