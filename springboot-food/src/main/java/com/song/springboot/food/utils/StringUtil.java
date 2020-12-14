package com.song.springboot.food.utils;

import com.song.springboot.food.exception.ParamNullException;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description String工具类
 * @Date 2020/9/6 18:18
 * @Created by Jeremy
 */
public class StringUtil {

    /**
     * 验证手机号的正则
     */
    private static final String regexPhone = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\\\d{8}$";

    private static final String regexEmail = "^([a-z0-9A-Z]+[-|\\\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\\\.)+[a-zA-Z]{2,}$";

    private static final String regexIdCard = "(^\\\\d{18}$)|(^\\\\d{15}$)";

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


    public static boolean isPhone(String phone){
        Pattern p = Pattern.compile(regexPhone, Pattern.CASE_INSENSITIVE);
        return p.matcher(phone).matches();
    }

    public static boolean isEmail(String email){
        Pattern p = Pattern.compile(regexEmail, Pattern.CASE_INSENSITIVE);
        return p.matcher(email).matches();
    }


    /**
     * 验证所有参数都不能为空
     * @throws ParamNullException
     * */
    public static void validateParamNotNull(Object... obj) throws ParamNullException {
        if (!checkParamNotNull(obj)) {
            throw new ParamNullException();
        }
    }

    /**
     * 验证所有参数都不能为空
     *
     * @return false:有为空的参数，true:都不为空
     */
    public static boolean checkParamNotNull(Object... obj) {
        for(int i = 0; i < obj.length; i++) {
            if((obj[i] instanceof List && StringUtil.isNullOrBlank((List)obj[i]))
                    || (obj[i] instanceof Map && StringUtil.isNullOrBlank((Map)obj[i]))
                    || (obj[i] instanceof String && StringUtil.isNullOrBlank((String)obj[i]))
                    || (StringUtil.isNullOrBlank(obj[i]))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 验证参数至少一个不能为空
     * @throws ParamNullException
     * */
    public static void validateParamLeastOneNotNull(Object... obj) throws ParamNullException {
        if(!checkParamLeastOneNotNull(obj)) {
            throw new ParamNullException();
        }
    }

    /**
     * 验证参数至少一个不能为空
     *
     * @return false:都为空，true:有一个不为空
     */
    public static boolean checkParamLeastOneNotNull(Object... obj) {
        boolean flag = false;
        for(int i = 0; i < obj.length; i++) {
            if((obj[i] instanceof List && !StringUtil.isNullOrBlank((List)obj[i]))
                    || (obj[i] instanceof Map && !StringUtil.isNullOrBlank((Map)obj[i]))
                    || (obj[i] instanceof String && !StringUtil.isNullOrBlank((String)obj[i]))
                    || (!StringUtil.isNullOrBlank(obj[i]))) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
