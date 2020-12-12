package com.song.springboot.transaction.model;

/**
 * @Description 测试反射是否使用的是无参构造函数
 * @Date 2020/11/22 22:29
 * @Created by Jeremy
 */
public class TestReflect {
    public String name;
    public TestReflect(){}
    public TestReflect(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestReflect{" +
                "name='" + name + '\'' +
                '}';
    }
}
