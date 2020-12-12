package com.song.springboot.transaction.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
@Getter
@Setter
public class DpUser implements Serializable {
    private Long id;

    private String username;

    private String password;

    private String phone;

    private String email;

    private Integer roleId;

    private Byte enabled;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}