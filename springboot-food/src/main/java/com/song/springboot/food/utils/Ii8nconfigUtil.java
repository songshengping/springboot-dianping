package com.song.springboot.food.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

/**
 * @Author Jeremy
 * @Description 国际化工具类
 * @Date 2020-09-07 14:12
 **/
@Component
public class Ii8nconfigUtil {
    @Autowired
    private static MessageSource messageSource;

    public Ii8nconfigUtil(MessageSource messageSource){

    }

    /**
     * 获取单个国际化翻译值
     */
    public static String get(String msgKey) {
        try {
            return messageSource.getMessage(msgKey, null, LocaleContextHolder.getLocale());
        } catch (Exception e) {
            return msgKey;
        }
    }
}
