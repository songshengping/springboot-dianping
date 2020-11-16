package com.song.springboot.shiro.mapper;

import com.song.springboot.shiro.model.DpUser;

import java.util.List;

public interface DpUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DpUser record);

    int insertSelective(DpUser record);

    DpUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DpUser record);

    int updateByPrimaryKey(DpUser record);

    List<DpUser> findUserByUsername(String username);
}