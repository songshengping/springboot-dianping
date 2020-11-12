package com.song.springbootioccirculardependencies.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author Jeremy
 * @Description 模拟循环依赖
 * 1.什么时候开始依赖
 * 2.为什么会依赖
 * 3.重点关注getBean ->doGetBean ->createBean -> doCreateBean 重涉及的集合(容器),及其作用
 * @Date 2020-10-14 19:33
 **/
@Component
@Scope(value = "prototype")
public class Egg {
    @Autowired
    private Chicken chicken;

    public Egg(){

    }

    public void setInjectChicken(Chicken chicken) {
        this.chicken = chicken;
    }
}
