package com.song.springboot.redis.utils;

import lombok.Getter;

@Getter
public enum APIErrorCode {
    SUCCESS(0,"成功"),
    UNKNOW(999999, "未知错误");
    private String message;
    private Integer code;
    APIErrorCode(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}
