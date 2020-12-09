package com.song.springboot.redis.controller;

import com.song.springboot.redis.service.RedisService;
import com.song.springboot.redis.utils.APIResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jeremy
 * @Description Redis操作接口
 * @Date 2020-12-08 17:36
 **/
@Api(value = "redis", tags = "Redis操作接口")
@RestController
@RequestMapping(value = "/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @ApiOperation(value = "获取Redis对应建的值", notes = "获取Redis对应建的值")
    @GetMapping(value = "/get")
    public APIResponse<Object> getValueByKey(@ApiParam(value = "需要查询的键", name = "key") @RequestParam(value = "key") String key) {
        return new APIResponse<>(redisService.getValueByKey(key));
    }

    @ApiOperation(value = "设置Redis对应建的值", notes = "设置Redis对应建的值")
    @PostMapping(value = "/set")
    public APIResponse<Boolean> setValueByKey(@ApiParam(value = "需要设置的键", name = "key") @RequestParam(value = "key") String key,
                                             @ApiParam(value = "需要设置的值", name = "value") @RequestParam(value = "value") Object value) {
        return new APIResponse<>(redisService.setKeyValue(key, value));
    }

    @ApiOperation(value = "设置Redis对应建的值", notes = "设置Redis对应建的值")
    @DeleteMapping(value = "/del")
    public APIResponse<Boolean> delValueByKey(@ApiParam(value = "需要删除的键", name = "key") @RequestParam(value = "key") String key) {
        return new APIResponse<>(redisService.delKey(key));
    }

}
