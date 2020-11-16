package com.song.springboot.shiro.mapper;

import com.song.springboot.shiro.model.DpSrRoleMenu;

public interface DpSrRoleMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DpSrRoleMenu record);

    int insertSelective(DpSrRoleMenu record);

    DpSrRoleMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DpSrRoleMenu record);

    int updateByPrimaryKey(DpSrRoleMenu record);
}