package com.equne.onlinevideo.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 在线视频统一异常处理
 */
//@Component
public class VideoExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");

        if (ex instanceof UserException) {
            mv.addObject("message", ex.getMessage());
        } else {
            mv.addObject("message", "其他信息");
        }

        return mv;
    }
}