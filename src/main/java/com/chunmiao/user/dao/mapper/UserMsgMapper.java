package com.chunmiao.user.dao.mapper;

import com.chunmiao.common.BaseMapper;
import com.chunmiao.user.bo.UserMsg;

@BaseMapper
public interface UserMsgMapper {
    int insert(UserMsg record);

    int insertSelective(UserMsg record);
}