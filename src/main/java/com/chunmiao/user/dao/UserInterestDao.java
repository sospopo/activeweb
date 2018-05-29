package com.chunmiao.user.dao;

import com.chunmiao.user.bo.UserInterest;

import java.util.List;

public interface UserInterestDao {
    public void insertUserInterest(UserInterest userInterest) throws Exception;

    public void updateUserInterest(UserInterest interest) throws Exception;

    public List<UserInterest> queryInterInterest(Long userId) throws Exception;
}
