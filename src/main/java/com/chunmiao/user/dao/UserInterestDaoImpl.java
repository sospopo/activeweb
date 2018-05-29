package com.chunmiao.user.dao;

import com.chunmiao.user.bo.UserInterest;
import com.chunmiao.user.dao.mapper.UserInterestMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserInterestDaoImpl implements UserInterestDao{
    @Autowired
    private UserInterestMapper interestMapper;
    public void insertUserInterest(UserInterest userInterest) throws Exception {
        interestMapper.insertSelective(userInterest);
    }

    public void updateUserInterest(UserInterest interest) throws Exception {
        interestMapper.updateUserInterest(interest);
    }

    public List<UserInterest> queryInterInterest(Long userId) throws Exception {
        return interestMapper.queryInterInterest(userId);
    }

}
