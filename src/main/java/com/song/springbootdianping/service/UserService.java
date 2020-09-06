package com.song.springbootdianping.service;

import com.song.springbootdianping.dto.UserDTO;

public interface UserService {
    UserDTO findUserById(Integer id);
}
