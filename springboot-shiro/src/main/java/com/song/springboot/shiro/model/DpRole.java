package com.song.springboot.shiro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DpRole implements Serializable {
    private Integer id;

    private String name;

    private List<DpMenu> menuList;
    private static final long serialVersionUID = 1L;

}