package com.chunmiao.user.dao;

import com.chunmiao.user.bo.User;

public interface UserDao {
    public void createUser(User user) throws Exception;

    public void updateUser(User user) throws Exception;

    public void deleteUser(Long userId) throws Exception;

    public User selectUserById(Long userId) throws Exception;
}
