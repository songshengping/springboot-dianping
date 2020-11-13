package com.song.springboot.transaction;

import com.song.springboot.transaction.service.UserService;
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
		UserService user = applicationContext.getBean(UserService.class);
		System.out.println("args = " + Arrays.deepToString(args));
	}

}
