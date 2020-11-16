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
public class DpMenu implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;
}