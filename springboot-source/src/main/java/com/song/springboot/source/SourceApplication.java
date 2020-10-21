package com.song.springboot.source;

import com.song.springboot.source.bean.ConditionBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SourceApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SourceApplication.class, args);

        System.out.println("ConditionBean:" + applicationContext.getBean(ConditionBean.class));
    }

}
