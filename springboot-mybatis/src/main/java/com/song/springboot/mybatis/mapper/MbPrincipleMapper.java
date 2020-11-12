package com.song.springboot.mybatis.mapper;

import com.song.springboot.mybatis.model.MbPrinciple;

public interface MbPrincipleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MbPrinciple record);

    int insertSelective(MbPrinciple record);

    MbPrinciple selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MbPrinciple record);

    int updateByPrimaryKey(MbPrinciple record);
}