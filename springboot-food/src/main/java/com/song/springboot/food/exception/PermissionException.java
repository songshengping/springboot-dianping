package com.song.springboot.food.exception;

import com.song.springboot.food.common.APIErrorCode;

/**
 * @Description 权限异常
 * @Date 2020/9/6 20:19
 * @Created by Jeremy
 */
public class PermissionException extends BaseExceprion{
    public PermissionException(APIErrorCode error){
        super(error);
    }

    public PermissionException(APIErrorCode error, Object... params){
        super(error, params);
    }

    public PermissionException(int code, String errorMessage){
        super(code, errorMessage);
    }
}
