package com.song.springboot.transaction.utils;

/**
 * @Author Jeremy
 * @Description 错误码
 * @Date 2020-11-12 18:41
 **/
public enum APIErrorCode {
    SUCCESS(0,"");
    private String errorMessage;
    private int code;
    APIErrorCode(int code, String errorMessage){
        this.code = code;
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
    public int getCode() {
        return code;
    }

}
