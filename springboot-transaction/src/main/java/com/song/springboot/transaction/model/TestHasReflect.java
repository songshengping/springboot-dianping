package com.song.springboot.transaction.model;

/**
 * @Description 测试注入
 * @Date 2020/11/22 23:04
 * @Created by Jeremy
 */
public class TestHasReflect {
    private TestReflect testReflect;
    public void setTestReflect(TestReflect testReflect){
        this.testReflect = testReflect;
    }

    @Override
    public String toString() {
        return "TestHasReflect{" +
                "testReflect=" + testReflect.toString() +
                '}';
    }
}
