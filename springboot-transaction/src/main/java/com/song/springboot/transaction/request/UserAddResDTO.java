package com.song.springboot.transaction.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author Jeremy
 * @Description 用户请求接受类
 * @Date 2020-11-12 18:28
 **/
@ApiModel(value = "请求添加用户时封装的接收参数类",description = "封装的接收参数类")
public class UserAddResDTO {

    @ApiModelProperty(value = "用户名称",required = true)
    private String username;
    @ApiModelProperty(value = "用户密码",required = true)
    private String password;
    @ApiModelProperty(value = "用户电话",required = true)
    private String phone;
    @ApiModelProperty(value = "用户邮箱",required = true)
    private String email;
    @ApiModelProperty(value = "用户角色")
    private Integer roleId;
    @ApiModelProperty(value = "用户是否可用")
    private Byte enabled;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }
}
