package com.chunmiao.activity.dao;

import com.chunmiao.activity.bo.Activity;
import com.chunmiao.activity.bo.ActivityAttach;
import com.chunmiao.activity.dao.mapper.ActivityAttachMapper;
import com.chunmiao.activity.dao.mapper.ActivityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ActivityAttachDaoImpl implements ActivityAttachDao{
    @Autowired
    private ActivityAttachMapper activityAttachMapper;

    public void createActivityAttaches(List<ActivityAttach> activityAttaches) {
        activityAttachMapper.batchInserts(activityAttaches);
    }

    public List<ActivityAttach> queryByActivityId(Long activityId) {
        return activityAttachMapper.queryByActivityId(activityId);
    }
}
