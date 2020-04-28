package com.example.provider.controller;

import com.example.provider.pojo.User;
import com.example.provider.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/insert")
    public Map insert(@RequestBody User user){
        Map<Object,Object> map = new HashMap<Object,Object>(16);
        try {
            userService.insertUserInfo(user);
            map.put("success",true);
            map.put("message","数据插入成功！");
            log.debug("数据插入成功");
            return map;
        }catch (Exception e){
            e.printStackTrace();
            log.debug("数据插入失败！");
            map.put("success",false);
            map.put("message","数据插入失败");
            return map;
        }
    }

    @RequestMapping(value = "/api/query")
    public Map queryById(@RequestBody User user){
        Map<Object,Object> map = new HashMap<Object,Object>(16);

        try {
            User userInfo = userService.queryUserInfoById(user.getId());
            log.debug("数据查询成功！");
            map.put("success",true);
            map.put("message","数据查询成功！");
            map.put("result",userInfo);
            return map;
        }catch (Exception e){
            e.printStackTrace();
            map.put("success",false);
            map.put("message","数据查询失败！");
            log.debug("数据查询失败！");
            return map;
        }
    }
    @RequestMapping(value = "/api/getUserByName")
    public Map getUserByName(@RequestBody User user){
        Map<Object,Object> map = new HashMap<Object,Object>(16);

        try {
            List<User> userInfo = userService.getUserByName(user);
            log.debug("数据查询成功！");
            map.put("success",true);
            map.put("message","数据查询成功！");
            map.put("result",userInfo);
            return map;
        }catch (Exception e){
            e.printStackTrace();
            map.put("success",false);
            map.put("message","数据查询失败！");
            log.debug("数据查询失败！");
            return map;
        }
    }
    @RequestMapping(value = "/api/testRibbon")
    public String testRibbon(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("provider2");
        return "provider2";
    }
}
