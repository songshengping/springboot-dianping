package com.song.springboot.food.controller;

import com.song.springboot.food.common.APIErrorCode;
import com.song.springboot.food.common.APIResponse;
import com.song.springboot.food.dto.UserDTO;
import com.song.springboot.food.dto.UserLoginSuccessDTO;
import com.song.springboot.food.exception.GeneralException;
import com.song.springboot.food.request.UserLoginRequest;
import com.song.springboot.food.request.UserRegistRequest;
import com.song.springboot.food.service.UserService;
import com.song.springboot.food.utils.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description 用户对外接口
 * @Date 2020/9/6 10:30
 * @Created by Jeremy
 */
@RestController
@RequestMapping(value = "/user")
@Api(value = "用户接口", tags = "用户有关的注册,登录,退出等操作")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "根据用户id查询用户信息", notes = "用户查询接口")
    public APIResponse<UserDTO> getUser(@PathVariable(value = "id", name = "id") Long id) throws GeneralException {
        return new APIResponse<>(userService.findUserById(id));
    }

    @GetMapping(value = "/username-is-exist")
    @ApiOperation(value = "根据用户id查询用户信息", notes = "用户查询接口")
    public APIResponse<Boolean> getUser(@RequestParam(value = "name", name = "name") String username) {
        return new APIResponse<>(userService.findUserByUsername(username));
    }

    @PostMapping(value = "/regist")
    @ApiOperation(value = "用户注册", notes = "用户注册接口")
    public APIResponse<Boolean> userRegist(@RequestBody UserRegistRequest requestBody) throws GeneralException {
        // 参数校验不能为空
        StringUtil.checkParamNotNull(requestBody, requestBody.getUsername(), requestBody.getPassword(),
                requestBody.getEmail(), requestBody.getGender(),
                requestBody.getNickname(), requestBody.getPhone());
        // 参数校验正确性
        if (!StringUtil.isPhone(requestBody.getPhone())) {
            throw new GeneralException(APIErrorCode.USER_PHONE_ERROR);
        }
        if (!StringUtil.isEmail(requestBody.getEmail())) {
            throw new GeneralException(APIErrorCode.USER_EMAIL_ERROR);
        }
        if (userService.findUserByUsername(requestBody.getUsername())) {
            throw new GeneralException(APIErrorCode.USER_NAME_EXIST_ERROR);
        }
        return new APIResponse<>(userService.userRegist(requestBody));
    }

    @PostMapping(value = "/login")
    @ApiOperation(value = "用户登录", notes = "用户登录接口")
    public APIResponse<UserLoginSuccessDTO> userLogin(@RequestBody UserLoginRequest requestBody) {
        // 参数校验
        return new APIResponse<>(userService.userLogin(requestBody));
    }

    @PostMapping(value = "/logout")
    @ApiOperation(value = "用户登出", notes = "用户登出接口")
    public APIResponse<Boolean> userLogout() {

        return null;
    }
}
