package com.song.springboot.food.config.druid;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @Description Druid的过滤器,用于过滤一些静态文件
 * @Date 2020/9/26 12:16
 * @Created by Jeremy
 */
@WebFilter(
        filterName = "druidWebStatFilter",urlPatterns = "/*",
        initParams = {
                @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bpm,*.png,*.css,*.ico,/druid/*") //忽略资源
        }
)
public class DruidFilter extends WebStatFilter {
}
