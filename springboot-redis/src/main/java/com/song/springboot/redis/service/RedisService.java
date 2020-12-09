package com.song.springboot.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @Author Jeremy
 * @Description //TODO
 * @Date 2020-12-08 17:37
 **/
@Service
public class RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    public Object getValueByKey(String key){
        return redisTemplate.opsForValue().get(key);
    }

    public boolean setKeyValue(String key, Object value){
        redisTemplate.opsForValue().set(key, value);
        return true;
    }

    public boolean delKey(String key){
        return redisTemplate.delete(key);
    }
}
