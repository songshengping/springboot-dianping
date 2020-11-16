package com.song.springboot.shiro.mapper;

import com.song.springboot.shiro.model.DpMenu;

public interface DpMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DpMenu record);

    int insertSelective(DpMenu record);

    DpMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DpMenu record);

    int updateByPrimaryKey(DpMenu record);
}