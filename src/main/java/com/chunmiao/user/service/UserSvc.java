package com.chunmiao.user.service;

import com.chunmiao.user.bo.User;

public interface UserSvc {
    public void createUser(User user) throws Exception;

    public User queryUserById(Long userId) throws Exception;

    public User queryUserByName(String userName) throws Exception;
}
