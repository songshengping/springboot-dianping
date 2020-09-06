package com.song.springbootdianping.utils;

import java.util.List;
import java.util.Map;

/**
 * @Description String工具类
 * @Date 2020/9/6 18:18
 * @Created by Jeremy
 */
public class StringUtil {
    public static boolean isNullOrBlank(String[] strArray){
        return strArray == null || strArray.length == 0;
    }

    public static boolean isNullOrBlank(String str){
        return str == null || "".equals(str);
    }

    public static boolean isNullOrBlank(List list){
        return list == null || list.isEmpty();
    }

    public static boolean isNullOrBlank(Map map){
        return map == null || map.isEmpty();
    }

    public static boolean isNullOrBlank(Object obj){
        if (obj instanceof String) {
            return isNullOrBlank((String) obj);
        } else if (obj instanceof String[]) {
            return isNullOrBlank((String[]) obj);
        }else if (obj instanceof List) {
            return isNullOrBlank((List)obj);
        } else if (obj instanceof Map) {
            return isNullOrBlank((Map)obj);
        }

        return obj == null || "".equals(obj);
    }
}
