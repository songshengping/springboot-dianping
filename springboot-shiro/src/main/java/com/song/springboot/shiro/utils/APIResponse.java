package com.song.springboot.shiro.utils;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description 全局后端返回对象
 * @Date 2020/11/15 16:11
 * @Created by Jeremy
 */
@Getter
@Setter
public class APIResponse<T> {
    private Boolean success;
    private Integer code;
    private String errorMessage;
    private T data;

}
