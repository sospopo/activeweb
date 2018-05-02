package com.chunmiao.controller;

import org.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.HashMap;
import java.util.Map;

public class BaseController {

    public Map<String,Object> getResult(){
        Map<String,Object> result = new HashMap<String, Object>();
        result.put("data","");
        result.put("code",1);
        result.put("info","成功!");
        return result;
    }
}
