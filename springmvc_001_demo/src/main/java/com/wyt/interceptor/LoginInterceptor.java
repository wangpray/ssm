package com.wyt.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 判断是否登录过，通过session中的标识
        if (request.getSession().getAttribute("flag") == null) {
            // 为null表示还没登录，提示登录
            request.setAttribute("fail", "您还没登录，请先登录！");
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
            return false;
        }

        return true;
    }
}
