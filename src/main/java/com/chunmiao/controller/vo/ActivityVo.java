package com.chunmiao.controller.vo;

import com.chunmiao.activity.bo.Activity;
import com.chunmiao.activity.bo.ActivityAttach;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;
import java.util.List;

public class ActivityVo {
    private Long userId;
    private String userName;
    private String activityTitle;
    private Date createTime;
    private Integer dzCount;
    private Integer plCount;
    private List<ActivityAttach> attaches;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDzCount() {
        return dzCount;
    }

    public void setDzCount(Integer dzCount) {
        this.dzCount = dzCount;
    }

    public Integer getPlCount() {
        return plCount;
    }

    public void setPlCount(Integer plCount) {
        this.plCount = plCount;
    }

    public List<ActivityAttach> getAttaches() {
        return attaches;
    }

    public void setAttaches(List<ActivityAttach> attaches) {
        this.attaches = attaches;
    }
}
