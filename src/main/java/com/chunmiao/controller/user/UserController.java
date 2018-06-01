package com.chunmiao.controller.user;


import com.chunmiao.controller.BaseController;
import com.chunmiao.controller.vo.UserVo;
import com.chunmiao.user.bo.School;
import com.chunmiao.user.bo.User;
import com.chunmiao.user.service.SchoolSvc;
import com.chunmiao.user.service.UserSvc;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserSvc userSvc;
    @Autowired
    private SchoolSvc schoolSvc;

    @RequestMapping("sayHello")
    @ResponseBody
    public Map<String,Object> sayHello(@RequestParam("username") String name){
        Map<String,Object> map = getResult();
        map.put("data","welcome ! " + name);
        return map;
    }

    @RequestMapping("createUser")
    @ResponseBody
    public Map<String,Object> createUser(@RequestParam("userName") String userName,
                                         @RequestParam("phoneNumber") Long phoneNumber,
                                         @RequestParam("email") String email,
                                         @RequestParam("password") String password,
                                         @RequestParam("major") String major){
        Map<String,Object> map = getResult();
        try {
            if (userName == null || userName.equals("") ||
                    phoneNumber == null || phoneNumber == 0 ||
                    email == null || email.equals("")){
                map.put("code",-1);
                map.put("info","param has error!!!");
                return map;
            }
            User user = new User();
            user.setCreateTime(new Date());
            user.setUpdateTime(new Date());
            user.setUserName(userName);
            user.setPhoneNumber(phoneNumber);
            user.setPassword(password);
            user.setEmail(email);
            user.setMajor(major);
            userSvc.createUser(user);
        }catch (Exception e){
            map.put("code",-1);
            map.put("info","server has inter error!!!");
            logger.error("error message : ",e);
            return map;
        }
        return map;
    }

    @RequestMapping("login")
    @ResponseBody
    public Map<String,Object> login(@RequestParam("userName") String userName,
                                         @RequestParam("password") String password){
        Map<String,Object> map = getResult();
        try {
            if (userName == null || userName.equals("") ||
                    password == null || password.equals("")){
                map.put("code",-1);
                map.put("info","param has error!!!");
                return map;
            }
            User user = userSvc.queryUserByName(userName);
            if (user == null || !user.getPassword().equals(password)){
                map.put("code",-1);
                map.put("info","请检查用户登陆信息！");
                return map;
            }
            UserVo userVo = genUserInfo(user);

            map.put("data",userVo);
        }catch (Exception e){
            map.put("code",-1);
            map.put("info","server has inter error!!!");
            logger.error("error message : ",e);
            return map;
        }
        return map;
    }

    @RequestMapping("queryUserInfo")
    @ResponseBody
    public Map<String,Object> queryUserInfo(@RequestParam("userId")Long userId){
        Map<String,Object> map = getResult();
        try {
            if (userId != null && userId <= 0){
                map.put("code",-1);
                map.put("info","param has error!!!");
                return map;
            }
            User user = userSvc.queryUserById(userId);
            if (user == null){
                map.put("code",-1);
                map.put("info","请检查用户登陆信息！");
                return map;
            }

            UserVo userVo = genUserInfo(user);

            map.put("data",userVo);
        }catch (Exception e){
            map.put("code",-1);
            map.put("info","server has inter error!!!");
            logger.error("error message : ",e);
            return map;
        }
        return map;
    }

    private UserVo genUserInfo(User user) {
        School school = schoolSvc.queryById(user.getSchoolId());
        UserVo userVo = new UserVo();
        userVo.setUserId(user.getUserId());
        userVo.setUserName(user.getUserName());
        userVo.setEmail(user.getEmail());
        userVo.setPhoneNumber(user.getPhoneNumber());
        userVo.setGrade(user.getGrade());
        userVo.setMajor(user.getMajor());
        userVo.setUserType(user.getUserType());
        userVo.setSchoolId(user.getSchoolId());
        if (school != null){
            userVo.setSchoolName(school.getSchoolName());
        }
        return userVo;
    }
}
