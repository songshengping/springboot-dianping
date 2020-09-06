package com.song.springbootdianping.service.impl;

import com.song.springbootdianping.dto.UserDTO;
import com.song.springbootdianping.mapper.UserMapper;
import com.song.springbootdianping.mapstruct.UserMapStruct;
import com.song.springbootdianping.service.UserService;
import com.song.springbootdianping.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 用户服务实现类
 * @Date 2020/9/6 10:31
 * @Created by Jeremy
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO findUserById(Integer id) {
        if (StringUtil.isNullOrBlank(id)) {
            return null;
        }
        return UserMapStruct.USER_MAPSTRUCT.toDto(userMapper.selectByPrimaryKey(id.longValue()));
    }
}
