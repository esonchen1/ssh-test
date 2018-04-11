package com.jld.ssh.service.impl;

import com.jld.ssh.dao.UserDao;
import com.jld.ssh.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("dasdsaqq");
        userDao.add();
    }
}
