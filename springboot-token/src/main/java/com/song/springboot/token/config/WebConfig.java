package com.song.springboot.token.config;

import com.song.springboot.token.interceptor.AuthInterceptor;
import com.song.springboot.token.interceptor.RuntimeRecordInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author Jeremy
 * @Description 配置拦截器
 * @Date 2020-10-22 10:34
 **/
@Configuration
public class WebConfig implements WebMvcConfigurer {

    // 拦截器中使用了RedisService，所以这里需要使用如下方式注入拦截器
    @Bean
    public AuthInterceptor initAuthInterceptor(){
        return new AuthInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInterceptor());
        registry.addInterceptor(new RuntimeRecordInterceptor());
    }
}
