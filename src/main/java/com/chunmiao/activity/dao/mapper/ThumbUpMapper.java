package com.chunmiao.activity.dao.mapper;

import com.chunmiao.activity.bo.ThumbUp;

public interface ThumbUpMapper {
    int deleteByPrimaryKey(Long thumbId);

    int insert(ThumbUp record);

    int insertSelective(ThumbUp record);

    ThumbUp selectByPrimaryKey(Long thumbId);

    int updateByPrimaryKeySelective(ThumbUp record);

    int updateByPrimaryKey(ThumbUp record);
}