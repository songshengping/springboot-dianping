package com.song.springbootdianping.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description Swagger2的配置类
 * @Date 2020/9/10 22:36
 * @Created by Jeremy
 */
@Configuration
@EnableSwagger2
@ConditionalOnProperty(
        prefix = "swagger-ui",
        name = {"enabled"},
        havingValue = "true"
)
public class Swagger2Config {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiinfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.song.springbootdianping"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiinfo() {
        return new ApiInfoBuilder().title("接口文档v1.0.0")
                .description("Swagger2 接口文档地址")
                .termsOfServiceUrl("https://swagger.io/")
                .version("v1.0.0")
                .build();
    }
}
