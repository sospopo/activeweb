package com.chunmiao.activity.dao.mapper;

import com.chunmiao.activity.bo.ActivityAttach;
import com.chunmiao.common.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@BaseMapper
public interface ActivityAttachMapper {
    int deleteByPrimaryKey(Long attachId);

    int insert(ActivityAttach record);

    int insertSelective(ActivityAttach record);

    ActivityAttach selectByPrimaryKey(Long attachId);

    int updateByPrimaryKeySelective(ActivityAttach record);

    int updateByPrimaryKeyWithBLOBs(ActivityAttach record);

    int updateByPrimaryKey(ActivityAttach record);

    void batchInserts(@Param("activityAttaches") List<ActivityAttach> activityAttaches);

    List<ActivityAttach> queryByActivityId(Long activityId);
}