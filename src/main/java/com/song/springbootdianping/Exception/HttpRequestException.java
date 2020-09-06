package com.song.springbootdianping.Exception;

import com.song.springbootdianping.common.APIErrorCode;

/**
 * @Description http远程调用异常
 * @Date 2020/9/6 20:22
 * @Created by Jeremy
 */
public class HttpRequestException extends BaseExceprion{
    public HttpRequestException(APIErrorCode error){
        super(error);
    }

    public HttpRequestException(APIErrorCode error, Object... params){
        super(error, params);
    }

    public HttpRequestException(int code, String errorMessage){
        super(code, errorMessage);
    }
}
