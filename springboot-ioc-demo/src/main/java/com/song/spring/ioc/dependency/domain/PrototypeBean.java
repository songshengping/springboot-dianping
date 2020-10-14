package com.song.spring.ioc.dependency.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author Jeremy
 * @Description 非单例Bean 初始化过程
 * 1.非单例bean创建方法
 * 2.在容器中的保存位置
 * @Date 2020-10-14 16:43
 **/
@Component
@Scope("prototype")
public class PrototypeBean {
    private Egg egg;

    public PrototypeBean(){
        System.out.println("非单例Bean的初始化开始");
        System.out.println("非单例Bean的初始化结束");

    }
}
