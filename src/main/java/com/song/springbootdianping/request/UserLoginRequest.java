package com.song.springbootdianping.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description 用户登录请求对象
 * @Date 2020/9/10 22:31
 * @Created by Jeremy
 */
@Getter
@Setter
public class UserLoginRequest {
    @ApiModelProperty(value = "username",name = "用户名")
    @JsonProperty(value = "username")
    private String username;
    @ApiModelProperty(value = "password",name = "密码")
    @JsonProperty(value = "password")
    private String password;
}
