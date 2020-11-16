package com.song.springboot.shiro.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Description 页面跳转的Controller
 * @Date 2020/11/15 17:04
 * @Created by Jeremy
 */
@Controller
@Api(value = "页面跳转的控制器")
public class PageController {

    @ApiOperation(value = "/", tags = "主页")
    @GetMapping({"/", "/index"})
    public String index(){
        return "/index";
    }

    @ApiOperation(value = "/401", tags = "未授权页面")
    @GetMapping("/401")
    public String unauthorizedRole(){
        return "/401";
    }

    @ApiOperation(value = "/delete", tags = "删除权限")
    @GetMapping("/delete")
    public String delete(){
        return "/delete";
    }

    @ApiOperation(value = "/select", tags = "查询权限")
    @GetMapping("/select")
    public String select(){
        return "/select";
    }

    @ApiOperation(value = "/login", tags = "登录页面")
    @GetMapping("/login")
    public String login(HttpServletRequest request, Map<String, Object> map){
        // 如果登录失败,就从HttpServletRequest 中获取shiro处理的异常信息,获取shiroLoginFailure就是shiro异常类的全名
        Subject user = SecurityUtils.getSubject();
        String exception = (String)request.getAttribute("shiroLoginFailure");
        String msg = "";
        if (exception != null) {
            if (UnknownAccountException.class.getName().equals(exception)) {
                msg = "用户名不存在!";
            } else if (IncorrectCredentialsException.class.getName().equals(exception)) {
                msg = "密码错误!";
            } else {
                msg = "exception";
            }
        }
        map.put("msg", msg);
        return "/login";
    }

    @ApiOperation(value = "/logout", tags = "登出")
    @GetMapping("/logout")
    public String logout(){
        return "/login";
    }
}
