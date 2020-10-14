package com.song.spring.ioc.dependency;

import com.song.spring.ioc.dependency.domain.PrototypeBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @Description SpringBoot循环依赖 示例
 * @Date 2020/10/12 22:36
 * @Created by Jeremy
 */
@SpringBootApplication
public class CyclicDependencyDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(CyclicDependencyDemo.class, args);
        applicationContext.getBean(PrototypeBean.class);
        System.out.println("args = [" + args + "]");
    }
}
