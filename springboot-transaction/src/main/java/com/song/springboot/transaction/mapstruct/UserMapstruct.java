package com.song.springboot.transaction.mapstruct;

import com.song.springboot.transaction.model.DpUser;
import com.song.springboot.transaction.request.UserAddResDTO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValueCheckStrategy= NullValueCheckStrategy.ALWAYS)
public interface UserMapstruct {
    UserMapstruct INSTANCE = Mappers.getMapper(UserMapstruct.class);

    DpUser toModel(UserAddResDTO userAdd);
}
