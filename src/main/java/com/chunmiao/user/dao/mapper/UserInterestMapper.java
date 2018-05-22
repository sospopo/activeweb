package com.chunmiao.user.dao.mapper;

import com.chunmiao.user.bo.User;
import com.chunmiao.user.bo.UserInterest;

public interface UserInterestMapper {
    int insert(UserInterest record);

    int insertSelective(UserInterest record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}