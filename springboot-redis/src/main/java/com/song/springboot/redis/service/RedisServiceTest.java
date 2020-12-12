package com.song.springboot.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description Redis业务类
 * @Date 2020/11/16 22:56
 * @Created by Jeremy
 */
@Service
public class RedisServiceTest {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    public void set(String key, Object value){
        ValueOperations<String, Object> vo = redisTemplate.opsForValue();
        vo.set(key, value);
    }

    public Object get(String key){
        ValueOperations<String, Object> vo = redisTemplate.opsForValue();
        return vo.get(key);
    }
}
