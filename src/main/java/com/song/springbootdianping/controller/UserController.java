package com.song.springbootdianping.controller;

import com.song.springbootdianping.common.APIResponse;
import com.song.springbootdianping.dto.UserDTO;
import com.song.springbootdianping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 用户对外接口
 * @Date 2020/9/6 10:30
 * @Created by Jeremy
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/{id}")
    public APIResponse<UserDTO> getUser(@PathVariable(value = "id", name = "id") Integer id) {
        return new APIResponse<UserDTO>(userService.findUserById(id));
    }
}
