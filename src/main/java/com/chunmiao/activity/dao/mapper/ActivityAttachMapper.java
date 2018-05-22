package com.chunmiao.activity.dao.mapper;

import com.chunmiao.activity.bo.ActivityAttach;

public interface ActivityAttachMapper {
    int deleteByPrimaryKey(Long attachId);

    int insert(ActivityAttach record);

    int insertSelective(ActivityAttach record);

    ActivityAttach selectByPrimaryKey(Long attachId);

    int updateByPrimaryKeySelective(ActivityAttach record);

    int updateByPrimaryKeyWithBLOBs(ActivityAttach record);

    int updateByPrimaryKey(ActivityAttach record);
}