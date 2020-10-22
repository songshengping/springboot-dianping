package com.song.springboot.token.controller;

import com.song.springboot.token.utils.APIResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Jeremy
 * @Description 登录控制器Controller
 * @Date 2020-10-22 15:00
 **/
@Controller
public class LoginController {

    @GetMapping(value = "/login")
    public APIResponse<String> login(@RequestParam(value = "username") String username,
                                     @RequestParam(value = "password") String password){

    }
}
