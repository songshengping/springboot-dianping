package com.song.spring.ioc.dependency.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Date 2020/10/12 22:35
 * @Created by Jeremy
 */
@Component
public class Egg {

    @Autowired
    private PrototypeBean prototypeBean;

    @Autowired
    private Chicken chicken;

    public Egg(){

    }

    @Autowired
    Egg(Chicken chicken){
        this.chicken = chicken;
    }
}
