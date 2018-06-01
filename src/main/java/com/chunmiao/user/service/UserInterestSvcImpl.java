package com.chunmiao.user.service;

import com.chunmiao.user.bo.UserInterest;
import com.chunmiao.user.dao.UserInterestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInterestSvcImpl implements UserInterestSvc{
    @Autowired
    UserInterestDao interestDao;

    public void insertUserInterest(UserInterest userInterest) throws Exception {
        interestDao.insertUserInterest(userInterest);
    }

    public void updateUserInterest(UserInterest interest) throws Exception {
        interestDao.updateUserInterest(interest);
    }

    public List<UserInterest> queryInterInterest(Long userId) throws Exception {
        return interestDao.queryInterInterest(userId);
    }
}