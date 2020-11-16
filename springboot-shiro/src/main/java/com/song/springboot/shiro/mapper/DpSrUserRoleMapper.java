package com.song.springboot.shiro.mapper;

import com.song.springboot.shiro.model.DpSrUserRole;

public interface DpSrUserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DpSrUserRole record);

    int insertSelective(DpSrUserRole record);

    DpSrUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DpSrUserRole record);

    int updateByPrimaryKey(DpSrUserRole record);
}