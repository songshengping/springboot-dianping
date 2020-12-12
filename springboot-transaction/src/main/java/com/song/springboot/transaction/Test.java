package com.song.springboot.transaction;

import com.song.springboot.transaction.model.TestUser;
import org.openjdk.jol.info.ClassLayout;

/**
 * @Author Jeremy
 * @Description 测试工具类功能
 * @Date 2020-11-13 20:07
 **/
public class Test {
    public static void main(String[] args) {
        TestUser user = new TestUser();
        System.out.println(ClassLayout.parseInstance(user).instanceSize());
        System.out.println(ClassLayout.parseInstance(user).toPrintable());
    }
}
