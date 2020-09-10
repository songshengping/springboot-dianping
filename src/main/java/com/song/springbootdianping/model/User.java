package com.song.springbootdianping.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Long id;

    private String phone;
    private String username;
    private String password;

    private String nickname;

    private String gender;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

}