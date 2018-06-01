package com.chunmiao.user.service;

import com.chunmiao.user.bo.User;
import com.chunmiao.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSvcImpl implements UserSvc{
    @Autowired
    private UserDao userDao;
    public void createUser(User user) throws Exception {
        userDao.createUser(user);
    }

    public User queryUserById(Long userId) throws Exception {
        return userDao.selectUserById(userId);
    }

    public User queryUserByName(String userName) throws Exception {
        return userDao.selectUserByName(userName);
    }
}
