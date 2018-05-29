package com.chunmiao.user.service;

import com.chunmiao.user.bo.School;

import java.util.List;

public interface SchoolSvc {
    public void insertSchool(School school) throws Exception;

    public List<School> querySchool(Integer pageNum, Integer pageSize) throws Exception;
}
