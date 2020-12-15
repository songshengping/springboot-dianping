package com.song.springboot.food.mapper;

import com.song.springboot.food.model.DpUser;

import java.util.List;

public interface DpUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DpUser record);

    int insertSelective(DpUser record);

    DpUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DpUser record);

    int updateByPrimaryKey(DpUser record);

    List<DpUser> findDpUserByUsername(String username);
}