package com.song.springboot.shiro.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class DpUser implements Serializable {
    private Long id;

    private String username;

    private String password;

    private String salt;

    private String phone;

    private String email;

    private Byte enabled;

    private Date createTime;

    private Date updateTime;

    private List<DpRole> roleList;

    private static final long serialVersionUID = 1L;

}