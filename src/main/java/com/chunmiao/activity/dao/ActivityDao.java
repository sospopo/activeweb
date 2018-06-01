package com.chunmiao.activity.dao;

import com.chunmiao.activity.bo.Activity;

import java.util.List;

public interface ActivityDao {
    public void createActivity(Activity activity) throws Exception;

    public Activity queryActivityById(Long activityId) throws Exception;

    public List<Activity> queryActivityByMap(Long userId, Integer sortType) throws Exception;

    void updateActivity(Activity activity);
}
