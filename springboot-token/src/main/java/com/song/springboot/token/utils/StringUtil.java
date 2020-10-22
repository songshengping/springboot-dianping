package com.song.springboot.token.utils;

/**
 * @Author Jeremy
 * @Description 字符串操作类
 * @Date 2020-10-22 11:11
 **/
public class StringUtil {
    public static boolean isNullOrBlank(String str){
        return str == null || "".equals(str);
    }

    public static boolean isNullOrBlank(Object obj){
        return obj == null || "".equals(obj);
    }
}
