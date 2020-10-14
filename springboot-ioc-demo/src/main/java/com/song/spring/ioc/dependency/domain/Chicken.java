package com.song.spring.ioc.dependency.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description 模拟循环依赖解析
 * @Date 2020/10/12 22:34
 * @Created by Jeremy
 */
@Component
public class Chicken {

    private Egg egg;

    public Chicken(){
    }

//    @Autowired
//    public void setInjectEgg(Egg egg){
//        System.out.println("Setter方法注入时机开始==========================");
//        this.egg = egg;
//        System.out.println("Setter方法注入时机结束==========================");
//    }

    @Autowired
    public Chicken(Egg egg){
        this.egg = egg;
    }
}
