package com.song.leetcode.demo.singleton;

/**
 * @Description 懒汉式
 * @Date 2020/10/25 10:13
 * @Created by Jeremy
 */
public class LazyInitSingeletion {
    private static volatile LazyInitSingeletion INSTANCE;
    private LazyInitSingeletion(){
        System.out.println("懒汉式实例化对象");
    }
    private static synchronized LazyInitSingeletion getInstance(){
        System.out.println("获取单例对象");
        if (INSTANCE == null) {
            INSTANCE = new LazyInitSingeletion();
        }
        return INSTANCE;
    }
}
