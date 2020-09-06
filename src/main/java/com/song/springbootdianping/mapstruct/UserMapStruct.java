package com.song.springbootdianping.mapstruct;

import com.song.springbootdianping.dto.UserDTO;
import com.song.springbootdianping.model.User;
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
    UserMapStruct USER_MAPSTRUCT = Mappers.getMapper(UserMapStruct.class);

    UserDTO toDto(User selectByPrimaryKey);
}
