package com.song.spring.ioc.dependency.domain;

import org.springframework.stereotype.Component;

/**
 * @Description 模拟循环依赖解析
 * @Date 2020/10/12 22:34
 * @Created by Jeremy
 */
@Component
public class Chicken {
    private Egg egg;
    Chicken(Egg egg){
        this.egg = egg;
    }
}
