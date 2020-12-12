package com.song.springboot.redis.controller;

import com.song.springboot.redis.model.User;
import com.song.springboot.redis.service.RedisServiceTest;
import com.song.springboot.redis.utils.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @Description 测试类
 * @Date 2020/11/16 23:03
 * @Created by Jeremy
 */
@RestController
@RequestMapping(value = "/redis")
public class RedisTestController {

    private Long count = 0L;

    @Autowired
    private RedisServiceTest redisService;

    @RequestMapping(value = "/put")
    public APIResponse<Boolean> putRedis(@PathParam(value = "key")String key){
        redisService.set(key, new User(count++, "Jeremy","18513355742"));
        return new APIResponse<>(true);
    }

    @RequestMapping(value = "/get")
    public APIResponse<Object> getRedis(@PathParam(value = "key")String key){
        return new APIResponse<>(redisService.get(key));
    }
}
