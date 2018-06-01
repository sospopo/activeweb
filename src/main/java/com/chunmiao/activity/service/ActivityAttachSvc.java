package com.chunmiao.activity.service;

import com.chunmiao.activity.bo.ActivityAttach;

import java.util.List;

public interface ActivityAttachSvc {
    public void createActivityAttaches(List<ActivityAttach> activityAttaches) throws Exception;

    public List<ActivityAttach> queryByActivityId(Long activityId) throws Exception;
}
