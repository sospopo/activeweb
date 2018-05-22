package com.chunmiao.user.dao.mapper;

import com.chunmiao.user.bo.UserMsg;

public interface UserMsgMapper {
    int insert(UserMsg record);

    int insertSelective(UserMsg record);
}