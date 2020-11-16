package com.song.springbootioccirculardependencies.demo;

import com.song.springbootioccirculardependencies.bean.UserHolder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import java.util.Arrays;

/**
 * @Description 基于 XML 资源的依赖Setter 方法注入示例
 * @Date 2020/11/14 17:52
 * @Created by Jeremy
 */
public class XmlDependencySetterInjectionDemo {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        String locationSource = "classpath:/META-INF/dependency-setter-injection.xml";
        beanDefinitionReader.loadBeanDefinitions(locationSource);

        System.out.println(beanFactory.getBean(UserHolder.class));
    }
}
