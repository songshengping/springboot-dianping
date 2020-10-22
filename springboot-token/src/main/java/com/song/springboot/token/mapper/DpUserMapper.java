package com.song.springboot.token.mapper;

import com.song.springboot.token.model.DpUser;

public interface DpUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DpUser record);

    int insertSelective(DpUser record);

    DpUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DpUser record);

    int updateByPrimaryKey(DpUser record);
}