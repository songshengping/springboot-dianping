package com.song.springboot.transaction.utils;

/**
 * @Author Jeremy
 * @Description 统一返回对象
 * @Date 2020-11-12 18:08
 **/
public class APIResponse<T> {
    private T data;
    private Integer code;
    private Boolean success;
    private String errorMessage;


    public APIResponse(APIErrorCode errorCode){
        this.success = errorCode.getCode() == 0;
        this.code = errorCode.getCode();
        this.errorMessage = errorCode.getErrorMessage();
    }

    public APIResponse(){

    }
    public APIResponse(T data){
        this(APIErrorCode.SUCCESS);
        this.data = data;
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
