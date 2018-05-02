package com.chunmiao.controller.user;


import com.chunmiao.controller.BaseController;
import com.chunmiao.user.bo.User;
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
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserSvc userSvc;
    @RequestMapping("sayHello")
    @ResponseBody
    public Map<String,Object> sayHello(@RequestParam("username") String name){
        Map<String,Object> map = getResult();
        map.put("data","welcome ! " + name);
        return map;
    }

    @RequestMapping("createUser")
    @ResponseBody
    public Map<String,Object> createUser(@RequestParam("username") String userName,
                                         @RequestParam("phoneNumber") Long phoneNumber,
                                         @RequestParam("email") String email){
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
            user.setEmail(email);
            userSvc.createUser(user);
        }catch (Exception e){
            map.put("code",-1);
            map.put("info","server has inter error!!!");
            logger.error("error message : ",e);
            return map;
        }
        return map;
    }
}
