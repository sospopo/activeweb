package com.chunmiao.activity.service;

import com.chunmiao.activity.bo.Activity;

import java.util.List;

public interface ActivitySvc {
    public void createActivity(Activity activity) throws Exception;

    public void updateActivity(Activity activity) throws Exception;

    public Activity queryActivityById(Long activityId) throws Exception;

    public List<Activity> queryActivityByMap(Long userId, Integer sortType) throws Exception;
}
