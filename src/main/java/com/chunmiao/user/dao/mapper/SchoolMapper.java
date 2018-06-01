package com.chunmiao.user.dao.mapper;

import com.chunmiao.common.BaseMapper;
import com.chunmiao.user.bo.School;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@BaseMapper
public interface SchoolMapper {
    int deleteByPrimaryKey(Long schoolId);

    int insert(School record);

    int insertSelective(School record);

    School selectByPrimaryKey(Long schoolId);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);

    List<School> query(@Param("pageNum") Integer pageNum,@Param("pageSize") Integer pageSize);
}