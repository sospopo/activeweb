package com.chunmiao.user.dao;

import com.chunmiao.user.bo.School;
import com.chunmiao.user.dao.mapper.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SchoolDaoImpl implements SchoolDao{
    @Autowired
    private SchoolMapper schoolMapper;
    public void insertSchool(School school) throws Exception {
        schoolMapper.insert(school);
    }

    public List<School> querySchool(Integer pageNum, Integer pageSize) throws Exception {
        return schoolMapper.query(pageNum,pageSize);
    }
}
