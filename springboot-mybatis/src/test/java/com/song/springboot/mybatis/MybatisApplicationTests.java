package com.song.springboot.mybatis;

import com.song.springboot.mybatis.mapper.MbPrincipleMapper;
import com.song.springboot.mybatis.model.MbPrinciple;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    private MbPrincipleMapper principleMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testInsert(){
        MbPrinciple record = new MbPrinciple();
        record.setName("测试");
        record.setPrinciple("原理");
        principleMapper.insert(record);
        System.out.println(record.getId());
    }

}
