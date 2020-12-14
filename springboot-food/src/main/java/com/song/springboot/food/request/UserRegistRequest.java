package com.song.springboot.food.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description 用户注册请求对象
 * @Date 2020/9/10 22:24
 * @Created by Jeremy
 */
@Getter
@Setter
public class UserRegistRequest {
    @ApiModelProperty(value = "nickname",name = "昵称")
    @JsonProperty(value = "nickname")
    private String nickname;
    @ApiModelProperty(value = "username",name = "用户名")
    @JsonProperty(value = "username")
    private String username;
    @ApiModelProperty(value = "password",name = "密码")
    @JsonProperty(value = "password")
    private String password;
    @ApiModelProperty(value = "phone",name = "手机号")
    @JsonProperty(value = "phone")
    private String phone;
    @ApiModelProperty(value = "email",name = "邮箱")
    @JsonProperty(value = "email")
    private String email;
    @ApiModelProperty(value = "gender",name = "性别:0:男,1:女")
    @JsonProperty(value = "gender")
    private Integer gender;
}
