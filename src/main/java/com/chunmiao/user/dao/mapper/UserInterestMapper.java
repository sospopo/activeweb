package com.chunmiao.user.dao.mapper;

import com.chunmiao.common.BaseMapper;
import com.chunmiao.user.bo.User;
import com.chunmiao.user.bo.UserInterest;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@BaseMapper
public interface UserInterestMapper {
    int insert(UserInterest record);

    int insertSelective(UserInterest record);

    void updateUserInterest(UserInterest record);

    List<UserInterest> queryInterInterest(@Param("userId") Long userId);
}