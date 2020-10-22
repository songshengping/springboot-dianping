package com.song.springboot.token.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.song.springboot.token.service.RedisService;
import com.song.springboot.token.utils.APIErrorCode;
import com.song.springboot.token.utils.APIResponse;
import com.song.springboot.token.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author Jeremy
 * @Description 登录拦截器
 * @Date 2020-10-22 10:30
 **/
@Component
public class AuthInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private RedisService  redisService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String token = request.getHeader("token");
        // 错误的情况返回的结果
        APIResponse error = null;
        ObjectMapper objectMapper = new ObjectMapper();
        // validate
        if (StringUtil.isNullOrBlank(token)) {
            error = new APIResponse(APIErrorCode.USER_NOT_LOGIN_ERROR);
            response.getWriter().write(objectMapper.writeValueAsString(error));
            return false;
        }
        // check
        if (StringUtil.isNullOrBlank(redisService.get(token))) {
            error = new APIResponse(APIErrorCode.USER_TOKEN_ERROR);
            response.getWriter().write(objectMapper.writeValueAsString(error));
            return false;
        }

        return super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        super.afterConcurrentHandlingStarted(request, response, handler);
    }
}
