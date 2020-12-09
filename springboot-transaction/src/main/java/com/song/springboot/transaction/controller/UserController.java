package com.song.springboot.transaction.controller;

import com.song.springboot.transaction.request.UserAddResDTO;
import com.song.springboot.transaction.service.UserService;
import com.song.springboot.transaction.utils.APIResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jeremy
 * @Description 用户Controller
 * @Date 2020-11-12 18:05
 **/
@RestController
@Api(value = "用户操作接口", tags = {"用户操作接口"})
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/user")
    @ApiOperation(value = "注册用户", notes = "注册用户")
    public APIResponse<Boolean> registerUser(@RequestBody UserAddResDTO userAdd){
        return new APIResponse<>(userService.registerUser(userAdd));
    }
}
