package com.song.springbootioccirculardependencies.demo;

import com.song.springbootioccirculardependencies.bean.User;
import com.song.springbootioccirculardependencies.bean.UserHolder;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @Description 基于 API 方法注入示例
 * @Date 2020/11/14 18:41
 * @Created by Jeremy
 */
public class ApiDependencyInjection {
    public static void main(String[] args) {
        // 创建容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(applicationContext);
        String locationSource = "classpath:/META-INF/dependency-setter-injection.xml";
        beanDefinitionReader.loadBeanDefinitions(locationSource);

        BeanDefinition beanDefinition = createUserHolderBeanDefinition();

        // 注册配置类
        applicationContext.register(ApiDependencyInjection.class);
        // 启动Spring应用上下文
        applicationContext.refresh();
        // 依赖查找并且创建Bean
        UserHolder userHolder = applicationContext.getBean(UserHolder.class);
        System.out.println(userHolder);
        // 关闭应用上下文
        applicationContext.close();
    }

    private static BeanDefinition createUserHolderBeanDefinition() {
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(UserHolder.class);
        beanDefinitionBuilder.addPropertyReference("user", "superUser");
        return beanDefinitionBuilder.getBeanDefinition();
    }

    @Bean
    public UserHolder userHolder(User user){
        UserHolder userHolder = new UserHolder();
        userHolder.setUser(user);
        return userHolder;
    }
}
