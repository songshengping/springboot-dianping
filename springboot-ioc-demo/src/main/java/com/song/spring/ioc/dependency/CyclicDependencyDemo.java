package com.song.spring.ioc.dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description SpringBoot循环依赖 示例
 * @Date 2020/10/12 22:36
 * @Created by Jeremy
 */
@SpringBootApplication
public class CyclicDependencyDemo {
    public static void main(String[] args) {
        SpringApplication.run(CyclicDependencyDemo.class, args);
    }
}
