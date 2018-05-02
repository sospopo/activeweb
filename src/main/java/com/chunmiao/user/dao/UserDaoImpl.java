package com.chunmiao.user.dao;

import com.chunmiao.user.bo.User;
import com.chunmiao.user.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.xml.ws.Action;

@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private UserMapper userMapper;
    public void createUser(User user) throws Exception{
        userMapper.insertSelective(user);
    }
}
