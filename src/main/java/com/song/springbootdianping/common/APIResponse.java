package com.song.springbootdianping.common;

import lombok.Data;

/**
 * @Description 通用返回对象
 * @Date 2020/9/6 17:44
 * @Created by Jeremy
 */
@Data
public class APIResponse<T> {
    public int code;
    public boolean success;
    public String errorMessage;
    public T data;

    public APIResponse(T data){
        this.code = 0;
        this.success = true;
        this.data = data;
    }

    public APIResponse(APIErrorCode error){
        this.code = error.getErrorCode();
        this.success = false;
        this.errorMessage = error.getErrorMessage();
    }

    public APIResponse(APIErrorCode error, T data){
        this.code = error.getErrorCode();
        this.success = false;
        this.errorMessage = error.getErrorMessage();
        this.data = data;
    }
}
