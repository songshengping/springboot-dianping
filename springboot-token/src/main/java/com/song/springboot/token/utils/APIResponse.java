package com.song.springboot.token.utils;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author Jeremy
 * @Description 后台统一返回给前端得类
 * @Date 2020-10-22 11:19
 **/
@Setter
@Getter
@NoArgsConstructor
public class APIResponse<T> {
    private Integer code;// 返回码
    private String  errorMessage;// 错误信息
    private Boolean success;// 请求是否成功
    private T data;
    public APIResponse(T data){
        this(APIErrorCode.SUCCESS, data);
    }
    public APIResponse(APIErrorCode error, T data){
        this(error);
        this.data = data;
    }
    public APIResponse(APIErrorCode errorCode){
        this.success = errorCode == APIErrorCode.SUCCESS;
        this.code = errorCode.getCode();
        this.errorMessage = errorCode.getErrorMessage();
    }
    public APIResponse(Integer code, String errorMessage){
        this.success = false;
        this.code = code;
        this.errorMessage = errorMessage;
    }
}
