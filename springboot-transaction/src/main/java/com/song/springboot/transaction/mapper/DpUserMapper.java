package com.song.springboot.transaction.mapper;

import com.song.springboot.transaction.model.DpUser;

public interface DpUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DpUser record);

    int insertSelective(DpUser record);

    DpUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DpUser record);

    int updateByPrimaryKey(DpUser record);
}