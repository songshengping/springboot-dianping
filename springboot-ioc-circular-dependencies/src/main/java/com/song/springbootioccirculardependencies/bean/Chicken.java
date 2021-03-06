package com.song.springbootioccirculardependencies.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author Jeremy
 * @Description 模拟循环依赖
 * 1.什么时候开始依赖
 * 2.为什么会依赖
 * 3.重点关注getBean ->doGetBean ->createBean -> doCreateBean 中涉及的集合(容器),及其作用
 * @Date 2020-10-14 19:33
 **/
@Component
public class Chicken {
    @Autowired
    private Egg egg;
    public Chicken(){

    }

    public void setInjectEgg(Egg egg){
        this.egg = egg;
    }
    public Chicken(Egg egg){
        this.egg = egg;
    }

}
