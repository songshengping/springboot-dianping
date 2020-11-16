package com.song.springboot.shiro.mapper;

import com.song.springboot.shiro.model.DpRole;

public interface DpRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DpRole record);

    int insertSelective(DpRole record);

    DpRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DpRole record);

    int updateByPrimaryKey(DpRole record);
}