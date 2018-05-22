package com.chunmiao.user.dao.mapper;

import com.chunmiao.user.bo.School;

public interface SchoolMapper {
    int deleteByPrimaryKey(Long schoolId);

    int insert(School record);

    int insertSelective(School record);

    School selectByPrimaryKey(Long schoolId);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);
}