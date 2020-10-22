package com.song.springboot.token.utils;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author Jeremy
 * @Description 项目的错误信息枚举
 * @Date 2020-10-22 11:23
 **/
@Getter
public enum  APIErrorCode {
    SUCCESS(0,""),
    /** 用户相关101xx */
    USER_NOT_LOGIN_ERROR(10100,"用户未登录"),
    USER_TOKEN_ERROR(10101,"用户认证信息错误"),
    USER_TOKEN_EXPIRE(10102,"用户认证信息过期"),
    UNKNOW_ERROR(99999,"未知错误");
    private String errorMessage;
    private Integer code;
    APIErrorCode(Integer code, String errorMessage){
        this.code = code;
        this.errorMessage = errorMessage;
    }
}
