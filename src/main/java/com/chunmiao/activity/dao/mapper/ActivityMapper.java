package com.chunmiao.activity.dao.mapper;

import com.chunmiao.activity.bo.Activity;

public interface ActivityMapper {
    int deleteByPrimaryKey(Long activityId);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Long activityId);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);
}