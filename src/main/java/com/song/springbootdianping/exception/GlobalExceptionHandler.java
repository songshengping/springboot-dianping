package com.song.springbootdianping.exception;

import com.song.springbootdianping.common.APIErrorCode;
import com.song.springbootdianping.common.APIResponse;
import com.song.springbootdianping.utils.LogUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Description 全局异常处理拦截类
 * @Date 2020/9/6 20:09
 * @Created by Jeremy
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(PermissionException.class)
    public APIResponse<String> handlePermissionException(PermissionException pe){
        LogUtil.logger.error("PermissionException",pe);
        return commonExceptionMessage(pe, APIErrorCode.AUTH_NO_PERMISSION);
    }

    /**
     * 类型转换异常
     * */
    @ExceptionHandler(NumberFormatException.class)
    public APIResponse<String> handleNumberFormatException(NumberFormatException ex) {
        LogUtil.logger.error("NumberFormatException", ex);
        return new APIResponse<>(APIErrorCode.DATA_TYPE_FORMAT_ERROR, ex.getMessage());
    }

    /*============================== 参数异常 ==============================*/
    /**
     * 参数为空
     * */
    @ExceptionHandler(ParamNullException.class)
    public APIResponse<String> handleParamNullException(ParamNullException ex) {
        LogUtil.logger.error("ParamNullException", ex);
        return commonExceptionMessage(ex, APIErrorCode.PARAM_NOT_NULL);
    }

    /*============================== 命令执行异常 ==============================*/
    /**
     * 命令执行失败
     * */
    @ExceptionHandler(ShellCommandException.class)
    public APIResponse<String> handleShellCommandException(ShellCommandException ex) {
        LogUtil.logger.error("ShellCommandException", ex);
        return commonExceptionMessage(ex, APIErrorCode.COMMAND_EXEC_FAIL);
    }

    /*============================== 通用的异常处理 ==============================*/
    /**
     * 通用的异常处理
     * */
    @ExceptionHandler(GeneralException.class)
    public APIResponse<String> handleGeneralException(GeneralException ex) {
        LogUtil.logger.error("GeneralException", ex);
        return commonExceptionMessage(ex, APIErrorCode.UNKNOWN_ERROR);
    }

    private APIResponse<String> commonExceptionMessage(BaseExceprion be, APIErrorCode error){
        return new APIResponse<String>(error, be.getMessage());
    }
}
