package com.example.consumer.controller;

import com.example.consumer.pojo.User;
import com.example.consumer.feign.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserConsumerController {
    @Autowired
    private UserFeignService userFeignService;

    @RequestMapping("/hello")
    public Map<Object, Object> query(@RequestBody User user) {
        Map map = userFeignService.queryById(user);
        return map;
    }

}
