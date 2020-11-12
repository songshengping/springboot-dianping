package com.song.leetcode.demo.singleton;

/**
 * @Description 双重校验单例模式
 * @Date 2020/10/25 10:13
 * @Created by Jeremy
 */
public class DoubleCheckSingeletion {
    private static volatile DoubleCheckSingeletion INSTANCE;

    private DoubleCheckSingeletion() {
        System.out.println("懒汉式实例化对象");
    }

    private static DoubleCheckSingeletion getInstance() {
        System.out.println("获取单例对象");
        if (INSTANCE == null) {
            synchronized (DoubleCheckSingeletion.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckSingeletion();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        DoubleCheckSingeletion.getInstance();
    }
}
