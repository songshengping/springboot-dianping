package com.song.springboot.transaction.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description 测试查看JAVA对象头
 * @Date 2020/11/21 20:07
 * @Created by Jeremy
 */
@Setter
@Getter
public class TestUser {
    private String name = "jeremy";
    private boolean sex;
    private Integer age;
}
