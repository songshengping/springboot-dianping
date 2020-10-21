package com.song.springboot.source.annotations.impl;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author Jeremy
 * @Description 接口实现类
 * @Date 2020-10-21 14:04
 **/
public class MyConditional implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String key = (String)metadata.getAnnotationAttributes("com.song.springboot.source.annotations.MyCondition").get("value");
        String value = context.getEnvironment().getProperty(key);
        System.out.println("key = [" + key + "], value = [" + value + "]");
        return value == null? false : Boolean.valueOf(value);
    }
}
