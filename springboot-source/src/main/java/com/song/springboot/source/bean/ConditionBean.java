package com.song.springboot.source.bean;

import com.song.springboot.source.annotations.MyCondition;
import org.springframework.stereotype.Component;

/**
 * @Author Jeremy
 * @Description 有条件的注册Bean
 * @Date 2020-10-21 14:07
 **/
@Component
@MyCondition(value = "com.song.condition")
public class ConditionBean {
}
