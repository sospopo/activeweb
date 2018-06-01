package com.chunmiao.activity.service;

import com.chunmiao.activity.bo.ActivityAttach;
import com.chunmiao.activity.dao.ActivityAttachDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActivityAttachSvcImpl implements ActivityAttachSvc {
    @Autowired
    private ActivityAttachDao activityAttachDao;
    public void createActivityAttaches(List<ActivityAttach> activityAttaches) throws Exception {
        activityAttachDao.createActivityAttaches(activityAttaches);
    }

    public List<ActivityAttach> queryByActivityId(Long activityId) throws Exception {
        return activityAttachDao.queryByActivityId(activityId);
    }
}
