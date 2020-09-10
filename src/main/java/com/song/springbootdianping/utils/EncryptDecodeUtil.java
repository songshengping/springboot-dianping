package com.song.springbootdianping.utils;

import org.apache.tomcat.util.security.MD5Encoder;

/**
 * @Description 和加密解密相关的工具类
 * @Date 2020/9/10 23:19
 * @Created by Jeremy
 */
public class EncryptDecodeUtil {

    /**
     * md5双重加密
     * @param value 需要加密的对象
     * @return 加密后的对象
     */
    public static String md5(String value){
        if (StringUtil.isNullOrBlank(value)) {
            throw new IllegalArgumentException("com.song.springbootdianping.utils.EncryptDecodeUtil.md5()");
        }
        return MD5Encoder.encode(MD5Encoder.encode(value.getBytes()).getBytes());
    }
}
