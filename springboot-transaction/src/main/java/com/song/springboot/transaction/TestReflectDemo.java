package com.song.springboot.transaction;

import com.song.springboot.transaction.model.TestHasReflect;
import com.song.springboot.transaction.model.TestReflect;

import java.util.Arrays;

/**
 * @Description 测试反射示例
 * @Date 2020/11/22 22:30
 * @Created by Jeremy
 */
public class TestReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        TestReflect object = new TestReflect();
        TestHasReflect tt = new TestHasReflect();
        tt.setTestReflect(object);
        System.out.println("1 toString = " + tt.toString());
        object.name = "jeremy";
        System.out.println("2 toString = " + tt.toString());

    }
}
