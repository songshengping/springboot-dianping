package com.song.springboot.shiro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DpSrRoleMenu implements Serializable {
    private Integer id;

    private Integer roleId;

    private Integer menuId;

    private static final long serialVersionUID = 1L;

}