package com.chunmiao.controller.activity;

import com.chunmiao.activity.bo.Activity;
import com.chunmiao.activity.bo.ActivityAttach;
import com.chunmiao.activity.service.ActivityAttachSvc;
import com.chunmiao.activity.service.ActivitySvc;
import com.chunmiao.controller.BaseController;
import com.chunmiao.controller.vo.ActivityVo;
import com.chunmiao.user.bo.User;
import com.chunmiao.user.service.UserSvc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("activity")
public class ActivityController extends BaseController {
    Logger logger = LoggerFactory.getLogger(ActivityController.class);

    @Autowired
    ActivitySvc activitySvc;
    @Autowired
    ActivityAttachSvc activityAttachSvc;
    @Autowired
    UserSvc userSvc;

    @RequestMapping("insertActivity")
    @ResponseBody
    public Map<String,Object> insertActivity(@RequestParam("activityTitle") String activityTitle,
                                             @RequestParam("userId") Long userId,
                                             @RequestParam("content") String content){
        Map<String,Object> map = getResult();
        try {
            Activity activity = new Activity();
            activity.setActivityTitle(activityTitle);
            activity.setActivityType((byte) 1);
            activity.setCreateTime(new Date());
            activity.setUpdateTime(new Date());
            activity.setIsDel((byte) 1);
            activity.setUserId(userId);
            activitySvc.createActivity(activity);

            ActivityAttach attach = new ActivityAttach();
            attach.setIsDel((byte) 1);
            attach.setActivityId(activity.getActivityId());
            attach.setAttachType((byte) 1);
            attach.setContent(content);
            attach.setCreateTime(new Date());
            attach.setUpdateTime(new Date());
            attach.setUserId(userId);
            List<ActivityAttach> list = new ArrayList<ActivityAttach>();
            list.add(attach);
            activityAttachSvc.createActivityAttaches(list);
        }catch (Exception e){
            logger.error("activity has a error : ",e);
            map.put("code",-1);
            map.put("info","查询数据失败！");
        }
        return map;
    }

    @RequestMapping("queryActivities")
    @ResponseBody
    public Map<String,Object> queryActivities(@RequestParam(name = "userId",defaultValue = "0") Long userId,
                                             @RequestParam(name = "orderBy",defaultValue = "1") Integer orderBy){
        Map<String,Object> map = getResult();
        try {
            List<ActivityVo> activityVos = new ArrayList<ActivityVo>();
            List<Activity> activities = activitySvc.queryActivityByMap(userId,orderBy);
            for(Activity activity : activities){
                User user = userSvc.queryUserById(activity.getUserId());
                if (user != null) {
                    ActivityVo activityVo = new ActivityVo();
                    List<ActivityAttach> attaches = activityAttachSvc.queryByActivityId(activity.getActivityId());
                    activityVo.setActivityTitle(activity.getActivityTitle());
                    activityVo.setCreateTime(activity.getCreateTime());
                    activityVo.setDzCount(0);
                    activityVo.setPlCount(0);
                    activityVo.setUserId(user.getUserId());
                    activityVo.setUserName(user.getUserName());
                    activityVo.setAttaches(attaches);

                    activityVos.add(activityVo);
                }
            }
            map.put("data",activityVos);
        }catch (Exception e){
            logger.error("activity has a error : ",e);
            map.put("code",-1);
            map.put("info","插入数据失败！");
        }
        return map;
    }
}
