package com.chunmiao.activity.dao.mapper;

import com.chunmiao.activity.bo.Activity;
import com.chunmiao.common.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
@BaseMapper
public interface ActivityMapper {
    int deleteByPrimaryKey(Long activityId);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Long activityId);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);

    List<Activity> queryActivityByMap(@Param("params") Map<String,Object> map);
}