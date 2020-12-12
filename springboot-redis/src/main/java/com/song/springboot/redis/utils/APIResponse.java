package com.song.springboot.redis.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Description 同意异常返回类
 * @Date 2020/11/16 23:07
 * @Created by Jeremy
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class APIResponse<T> {
    private String errorMessage;
    private Integer code;
    private Boolean success;
    private T data;

    public APIResponse(T data){
        this.data = data;
        this.success = true;
        this.code = 0;
    }
}
