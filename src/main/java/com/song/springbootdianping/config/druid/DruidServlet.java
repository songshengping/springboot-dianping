package com.song.springbootdianping.config.druid;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * @Description 用户过滤管理页面IP等信息
 * @Date 2020/9/26 12:21
 * @Created by Jeremy
 */
@WebServlet(
        urlPatterns = "/druid/*",
        initParams = {
                // IP允许名单(若没有配置或为空,这允许所有访问)
                @WebInitParam(name = "allow", value = ""),
                // IP拒绝名单(deny优先于allow)
                @WebInitParam(name = "deny", value = ""),
                // 登录druid管理页面用户名
                @WebInitParam(name = "loginUsername", value = "admin"),
                // 登录druid管理页面密码
                @WebInitParam(name = "loginPassword", value = "admin"),
        }
)
public class DruidServlet extends StatViewServlet {
}
