package com.song.springboot.redis.utils;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author Jeremy
 * @Description 后端返回通用对象
 * @Date 2020-12-09 12:50
 **/
@Getter
@Setter
public class APIResponse<T> {
    private String message;
    private Integer code;
    private Boolean success;
    private T data;
    public APIResponse(){
        this.success = true;
        this.message = "";
        this.code = 0;
    }
    public APIResponse(APIErrorCode errorCode){
        this.success = false;
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    public APIResponse(T data){
        this();
        this.data = data;
    }
}
