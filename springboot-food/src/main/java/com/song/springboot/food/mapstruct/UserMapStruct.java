package com.song.springboot.food.mapstruct;

import com.song.springboot.food.dto.UserDTO;
import com.song.springboot.food.model.DpUser;
import com.song.springboot.food.request.UserRegistRequest;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.factory.Mappers;

/**
 * @Description 用户转换实体类
 * @Date 2020/9/6 21:44
 * @Created by Jeremy
 */
@Mapper(nullValueCheckStrategy= NullValueCheckStrategy.ALWAYS)
public interface UserMapStruct {
    UserMapStruct INSTANCE = Mappers.getMapper(UserMapStruct.class);

    UserDTO toDto(DpUser selectByPrimaryKey);

    DpUser toModel(UserRegistRequest requestBody);
}
