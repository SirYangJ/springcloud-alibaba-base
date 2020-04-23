package com.example.consumer.feign;

import com.example.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient(name= "alibaba-cloud-provider")
public interface UserFeignService {
    @RequestMapping(value = "/api/query")
    Map queryById(@RequestBody User user);
}
