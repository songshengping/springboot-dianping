package com.song.springboot.transaction.controller;

import com.song.springboot.transaction.request.UserAddResDTO;
import com.song.springboot.transaction.service.UserService;
import com.song.springboot.transaction.utils.APIResponse;
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
@RequestMapping(value = "/user")
public class UserController {

    private UserService userService;
    @PostMapping()
    public APIResponse<Boolean> registerUser(@RequestBody UserAddResDTO userAdd){
        return new APIResponse<>(userService.registerUser(userAdd));
    }
}
