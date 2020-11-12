package com.song.leetcode.demo.singleton;

/**
 * @Description TODO
 * @Date 2020/10/25 10:06
 * @Created by Jeremy
 */
public class Test {
    public static void main(String[] args) {
        InnerStaticSingeletion.printSomething();
        InnerStaticSingeletion staticSingeletion = InnerStaticSingeletion.getInstance();
    }
}
