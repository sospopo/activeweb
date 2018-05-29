package com.chunmiao.user.dao.mapper;

import com.chunmiao.user.bo.School;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SchoolMapper {
    int deleteByPrimaryKey(Long schoolId);

    int insert(School record);

    int insertSelective(School record);

    School selectByPrimaryKey(Long schoolId);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);

    List<School> query(@Param("pageNum") Integer pageNum,@Param("pageSize") Integer pageSize);
}