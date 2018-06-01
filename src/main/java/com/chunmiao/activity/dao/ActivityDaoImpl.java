package com.chunmiao.activity.dao;

import com.chunmiao.activity.bo.Activity;
import com.chunmiao.activity.dao.mapper.ActivityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ActivityDaoImpl implements ActivityDao{
    @Autowired
    private ActivityMapper mapper;
    public void createActivity(Activity activity) throws Exception {
        mapper.insert(activity);
    }

    public Activity queryActivityById(Long activityId) throws Exception {
        return mapper.selectByPrimaryKey(activityId);
    }

    public List<Activity> queryActivityByMap(Long userId, Integer orderBy) throws Exception {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("userId",userId);
        map.put("orderBy",orderBy);
        return mapper.queryActivityByMap(map);
    }

    public void updateActivity(Activity activity) {
        mapper.updateByPrimaryKeySelective(activity);
    }
}
