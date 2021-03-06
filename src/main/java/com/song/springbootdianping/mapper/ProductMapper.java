package com.song.springbootdianping.mapper;

import com.song.springbootdianping.model.Product;

import java.util.Date;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    int updateProductCount(Integer id, Integer buyCount, String jeremy, Date date);
}