package com.song.springboot.food.exception;

import com.song.springboot.food.common.APIErrorCode;

/**
 * @Description shell脚本或命令执行异常
 * @Date 2020/9/6 20:20
 * @Created by Jeremy
 */
public class ShellCommandException extends BaseExceprion{
    public ShellCommandException(APIErrorCode error){
        super(error);
    }

    public ShellCommandException(APIErrorCode error, Object... params){
        super(error, params);
    }

    public ShellCommandException(int code, String errorMessage){
        super(code, errorMessage);
    }
}
