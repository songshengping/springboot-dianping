package com.song.leetcode.demo.singleton;

/**
 * @Description 饿汉式
 * @Date 2020/10/25 10:14
 * @Created by Jeremy
 */
public class HungarySingeletion {
    private static final HungarySingeletion INSTANCE = new HungarySingeletion();
    private HungarySingeletion(){
        System.out.println("实例化对象");
    }
    public static HungarySingeletion getInstance(){
        System.out.println("饿汉式获取单例对象");
        return INSTANCE;
    }

    public static void main(String[] args) {
        HungarySingeletion.getInstance();
    }
}
