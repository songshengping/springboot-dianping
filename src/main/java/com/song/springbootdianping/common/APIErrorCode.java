package com.song.springbootdianping.common;

import lombok.Getter;

/**
 * @Description 自定义异常
 * @Date 2020/9/6 17:47
 * @Created by Jeremy
 */
@Getter
public enum APIErrorCode {
    NO_OBJECT(10001,"对象不存在"),

    AUTH_NO_PERMISSION(20001, "权限不足"),

    DATA_TYPE_FORMAT_ERROR             	(17002, "数据转换异常"),

    COMMAND_EXEC_FAIL                  	(13002, "命令执行失败"),

    PARAM_NOT_NULL                     	(11001, "参数不能为空"),

    DB_SQL_ERROR	          		   	(15003, "数据库语句错误"),

    UNKNOWN_ERROR(99999,"未知错误");

    private int errorCode;
    private String errorMessage;
    private String placeholder;		//占位符
    APIErrorCode(int errorCode, String errorMessage){
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
