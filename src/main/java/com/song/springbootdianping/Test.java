package com.song.springbootdianping;

/**
 * @Author Jeremy
 * @Description //TODO
 * @Date 2020-09-10 13:18
 **/
public class Test {
    public static void main(String[] args) {
        int i = 16;
        int j = 16;
        System.out.println("args = [" + (i|j) + "]");

        String home = "/home/";
        System.out.println("args = [" + home.substring(0, home.length() -1) + "]");
    }
}
