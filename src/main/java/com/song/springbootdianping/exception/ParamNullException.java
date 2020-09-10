package com.song.springbootdianping.exception;

import com.song.springbootdianping.common.APIErrorCode;

/**
 * @Description 参数异常
 * @Date 2020/9/6 20:20
 * @Created by Jeremy
 */
public class ParamNullException extends BaseExceprion{
    public ParamNullException(){
        super();
    }
    public ParamNullException(APIErrorCode error){
        super(error);
    }
    public ParamNullException(APIErrorCode error, Object... params){
        super(error, params);
    }

    public ParamNullException(int code, String errorMessage){
        super(code, errorMessage);
    }
}
