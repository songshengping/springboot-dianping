package com.song.springboot.shiro.utils;

import java.util.List;

/**
 * @Description 数据校验工具类
 * @Date 2020/11/15 16:30
 * @Created by Jeremy
 */
public class ValidataUtil {
    /**
     * 验证对象是否为 null
     * @param obj 需要验证的对象
     * @return true:为null, false:不为bull
     */
    public static boolean isNullOrBlank(Object obj) {
        return obj == null;
    }

    /**
     * 验证字符串是否为 null
     * @param str 需要验证的对象
     * @return true:为null, false:不为bull
     */
    public static boolean isNull(String str) {
        return str == null;
    }

    /**
     * 验证字符串是否为 null 或者 空串
     * @param str 需要验证的对象
     * @return true:为null, false:不为bull
     */
    public static boolean isNullOrBlank(String str) {
        return str == null || "".equals(str);
    }

    /**
     * 验证List集合是否为空
     * @param list 需要验证的对象
     * @return true:为null, false:不为bull
     */
    public static boolean isNullOrBlank(List list) {
        return list == null || list.isEmpty();
    }
}
