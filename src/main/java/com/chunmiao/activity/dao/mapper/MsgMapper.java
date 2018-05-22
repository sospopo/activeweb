package com.chunmiao.activity.dao.mapper;

import com.chunmiao.activity.bo.Msg;

public interface MsgMapper {
    int deleteByPrimaryKey(Long msgId);

    int insert(Msg record);

    int insertSelective(Msg record);

    Msg selectByPrimaryKey(Long msgId);

    int updateByPrimaryKeySelective(Msg record);

    int updateByPrimaryKeyWithBLOBs(Msg record);

    int updateByPrimaryKey(Msg record);
}