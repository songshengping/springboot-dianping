package com.song.springbootdianping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.song.springbootdianping")
@MapperScan(basePackages = "com.song.springbootdianping.mapper")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ServletComponentScan// 使可以扫描到自定义的servlet
public class SpringbootDianpingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDianpingApplication.class, args);
    }

}
