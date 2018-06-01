package com.chunmiao.user.dao;

import com.chunmiao.user.bo.School;

import java.util.List;

public interface SchoolDao {
    public void insertSchool(School school) throws Exception;

    public List<School> querySchool(Integer pageNum,Integer pageSize) throws Exception;

    School queryById(Long schoolId);
}
