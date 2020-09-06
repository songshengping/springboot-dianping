package com.song.springbootdianping.Exception;

import com.song.springbootdianping.common.APIErrorCode;


/**
 * @Description 通用异常
 * @Date 2020/9/6 18:36
 * @Created by Jeremy
 */
public class GeneralException extends BaseExceprion{
    public GeneralException(APIErrorCode error){
        super(error);
    }

    public GeneralException(APIErrorCode error, Object... params){
        super(error, params);
    }

    public GeneralException(int code, String errorMessage){
        super(code, errorMessage);
    }
}
