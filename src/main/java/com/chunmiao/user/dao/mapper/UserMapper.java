package com.chunmiao.user.dao.mapper;

import com.chunmiao.common.BaseMapper;
import com.chunmiao.user.bo.User;
import org.apache.ibatis.annotations.Param;

@BaseMapper
public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectUserByName(@Param("userName") String userName);
}