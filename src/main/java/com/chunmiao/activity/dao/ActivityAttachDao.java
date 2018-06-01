package com.chunmiao.activity.dao;

import com.chunmiao.activity.bo.Activity;
import com.chunmiao.activity.bo.ActivityAttach;

import java.util.List;

public interface ActivityAttachDao {

    void createActivityAttaches(List<ActivityAttach> activityAttaches);

    List<ActivityAttach> queryByActivityId(Long activityId);
}
