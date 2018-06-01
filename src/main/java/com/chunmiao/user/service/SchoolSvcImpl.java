package com.chunmiao.user.service;

import com.chunmiao.user.bo.School;
import com.chunmiao.user.dao.SchoolDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolSvcImpl implements SchoolSvc{
    @Autowired
    SchoolDao schoolDao;
    public void insertSchool(School school) throws Exception {
        schoolDao.insertSchool(school);
    }

    public List<School> querySchool(Integer pageNum, Integer pageSize) throws Exception {
        return schoolDao.querySchool(pageNum,pageSize);
    }

    public School queryById(Long schoolId) {
        return schoolDao.queryById(schoolId);
    }
}
