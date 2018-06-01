package com.chunmiao.activity.service;

import com.chunmiao.activity.bo.Activity;
import com.chunmiao.activity.dao.ActivityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivitySvcImpl implements ActivitySvc {
    @Autowired
    private ActivityDao activityDao;

    public void createActivity(Activity activity) throws Exception {
        activityDao.createActivity(activity);
    }

    public void updateActivity(Activity activity) throws Exception {
        activityDao.updateActivity(activity);
    }

    public Activity queryActivityById(Long activityId) throws Exception {
        return activityDao.queryActivityById(activityId);
    }

    public List<Activity> queryActivityByMap(Long userId, Integer orderBy) throws Exception {
        return activityDao.queryActivityByMap(userId,orderBy);
    }
}
