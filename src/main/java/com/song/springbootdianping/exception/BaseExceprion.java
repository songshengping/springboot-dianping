package com.song.springbootdianping.exception;

import com.song.springbootdianping.common.APIErrorCode;
import com.song.springbootdianping.utils.StringUtil;
import lombok.Getter;
import lombok.Setter;

import java.text.MessageFormat;

/**
 * @Description 基本异常
 * @Date 2020/9/6 18:09
 * @Created by Jeremy
 */
@Getter
@Setter
public class BaseExceprion extends Exception{
    public Integer code;
    public String errorMessage;
    public String placeholder;
    public BaseExceprion(){
        super();
    }

    public BaseExceprion(APIErrorCode error){
        super();
        this.code = error.getErrorCode();
        this.errorMessage = error.getErrorMessage();
    }

    public BaseExceprion(APIErrorCode error, Object... params){
        super();
        this.code = error.getErrorCode();
        this.errorMessage = error.getErrorMessage();
        if (!StringUtil.isNullOrBlank(params)) {
            this.placeholder = MessageFormat.format(error.getPlaceholder(),params);
            if (!StringUtil.isNullOrBlank(this.placeholder)) {
                this.errorMessage = this.errorMessage + ";" + this.placeholder;
            }
        }
    }

    public BaseExceprion(int code, String errorMessage){
        super();
        this.code = code;
        this.errorMessage = errorMessage;
    }
}
