package com.song.leetcode.demo.singleton;

/**
 * @Description 静态内部内的初始化时机
 * @Date 2020/10/25 10:06
 * @Created by Jeremy
 */
public class InnerStaticSingeletion {
    private InnerStaticSingeletion(){
        System.out.println("初始化对象...");
    }

    public static class InstanceSingeletion{
        public static final InnerStaticSingeletion INSTANCE = new InnerStaticSingeletion();
    }

    public static InnerStaticSingeletion getInstance(){
        System.out.println("获取单例...");
        return InstanceSingeletion.INSTANCE;
    }

    public static void printSomething(){
        System.out.println("延迟初始化测试");
    }
}
