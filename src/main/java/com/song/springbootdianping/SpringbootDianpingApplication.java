package com.song.springbootdianping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = "com.song.springbootdianping")
@MapperScan(basePackages = "com.song.springbootdianping.mapper")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringbootDianpingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDianpingApplication.class, args);
    }

}
