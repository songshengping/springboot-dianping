package com.song.springboot.source.annotations;

import com.song.springboot.source.annotations.impl.MyConditional;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author Jeremy
 * @Description 自定义Condition注解
 * @Date 2020-10-21 14:03
 **/
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional({MyConditional.class})
public @interface MyCondition {
    String value();
}
