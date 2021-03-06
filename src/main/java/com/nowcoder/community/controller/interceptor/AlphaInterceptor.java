package com.nowcoder.community.controller.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import sun.util.logging.resources.logging;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ZHB
 * @create 2022-03-29 16:52
 */

//@Slf4j
@Component
public class AlphaInterceptor implements HandlerInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(AlphaInterceptor.class);


    //在Controller之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        log.debug("preHandle:" + handler.toString());
        LOGGER.debug("preHandle:" + handler.toString());
        return true;//只有给了true才可以放行
    }

    //在执行完Controller之后执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        log.debug("postHandle:" + handler.toString());
        LOGGER.debug("postHandle:" + handler.toString());
    }

    //在TemplateEngine（模板引擎）之后执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        log.debug("afterCompletion:" + handler.toString());
        LOGGER.debug("afterCompletion:" + handler.toString());
    }
}
