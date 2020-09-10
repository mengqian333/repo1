package com.example.demo.Interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 检查每个到来的请求对应的session域中是否有登录标识
        Object loginName = request.getSession().getAttribute("loginName");
        if (loginName == null) {
            //未登录，重定向到登陆页面
            System.out.println("未登录");
            response.sendRedirect("/login");
            return false;
        }
        System.out.println("当前用户已登录，登录的用户名为： " + loginName);
        return true;

    }
}
