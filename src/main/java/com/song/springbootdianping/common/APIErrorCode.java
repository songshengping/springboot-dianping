package com.song.springbootdianping.common;

import lombok.Getter;

/**
 * @Description 自定义异常
 * @Date 2020/9/6 17:47
 * @Created by Jeremy
 */
@Getter
public enum APIErrorCode {

    AUTH_NO_PERMISSION(20001, "权限不足"),

    DATA_TYPE_FORMAT_ERROR             	(17002, "数据转换异常"),

    COMMAND_EXEC_FAIL                  	(13002, "命令执行失败"),

    PARAM_NOT_NULL                     	(11001, "参数不能为空"),

    DB_SQL_ERROR	          		   	(15003, "数据库语句错误"),

    /** 和用户相关错误 10000 */
    USER_NOT_EXIST_ERROR(10001, "用户不存在"),
    USER_PHONE_ERROR(10002, "用户电话填写错误"),
    USER_EMAIL_ERROR(10003, "用户邮箱填写错误"),
    USER_NAME_EXIST_ERROR(10004, "用户名已存在"),

    UNKNOWN_ERROR(99999,"未知错误");

    private int errorCode;
    private String errorMessage;
    private String placeholder;		//占位符
    APIErrorCode(int errorCode, String errorMessage){
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public static APIErrorCode getAPIErrorCodeByCode(int code){
        for (APIErrorCode errorCode : APIErrorCode.values()) {
            if (errorCode.getErrorCode() == code) {
                return errorCode;
            }
        }
        throw new IllegalArgumentException("APIErrorCode.getAPIErrorCodeByCode('code')");
    }
}
