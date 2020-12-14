package com.song.springboot.food.service;

import com.song.springboot.food.common.APIErrorCode;
import com.song.springboot.food.dto.UserDTO;
import com.song.springboot.food.dto.UserLoginSuccessDTO;
import com.song.springboot.food.exception.GeneralException;
import com.song.springboot.food.mapper.UserMapper;
import com.song.springboot.food.mapstruct.UserMapStruct;
import com.song.springboot.food.model.User;
import com.song.springboot.food.request.UserLoginRequest;
import com.song.springboot.food.request.UserRegistRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 用户服务类
 * @Date 2020/9/10 23:07
 * @Created by Jeremy
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据用户ID查找用户
     * @param id
     * @return
     * @throws GeneralException
     */
    public UserDTO findUserById(Long id) throws GeneralException {
        User user = userMapper.selectByPrimaryKey(id);
        if (user == null) {
            throw new GeneralException(APIErrorCode.USER_NOT_EXIST_ERROR);
        }
        return UserMapStruct.INSTANCE.toDto(user);
    }

    /**
     * 注册用户
     * @param requestBody
     * @return
     */
    public Boolean userRegist(UserRegistRequest requestBody) {
        User user = UserMapStruct.INSTANCE.toModel(requestBody);
        return userMapper.insert(user) > 0;
    }

    public UserLoginSuccessDTO userLogin(UserLoginRequest requestBody) {

        return null;
    }

    /**
     * 根据用户名查找用户是否存在
     * @param username 用户名
     * @return true 存在, false 不存在
     */
    public Boolean findUserByUsername(String username) {
        List<User> user = userMapper.findUserByUsername(username);
        return !user.isEmpty();
    }
}
