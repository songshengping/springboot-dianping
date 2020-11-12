package com.song.springboot.transaction.service;

import com.song.springboot.transaction.mapper.DpUserMapper;
import com.song.springboot.transaction.mapstruct.UserMapstruct;
import com.song.springboot.transaction.model.DpUser;
import com.song.springboot.transaction.request.UserAddResDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Jeremy
 * @Description 用户业务逻辑处理类
 * @Date 2020-11-12 18:05
 **/
@Service
public class UserService {
    @Autowired
    private DpUserMapper userMapper;

    @Transactional(rollbackFor = Exception.class)
    public boolean registerUser(UserAddResDTO userAdd) {
        DpUser user = UserMapstruct.INSTANCE.toModel(userAdd);
        return userMapper.insert(user) > 0;
    }
}
