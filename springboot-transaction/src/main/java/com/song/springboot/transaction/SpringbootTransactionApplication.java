package com.song.springboot.transaction;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
@MapperScan(basePackages = "com.song.springboot.transaction.mapper")
public class SpringbootTransactionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootTransactionApplication.class, args);
		applicationContext.getBeanFactory();
		System.out.println("args = " + Arrays.deepToString(args));
	}

}
