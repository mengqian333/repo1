package com.example.demo.configuration;

import com.example.demo.Interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LoginConfiguration implements WebMvcConfigurer {

    @Autowired
    LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //通过注解获取自己定义的拦截器对象，然后注册拦截器。
        InterceptorRegistration loginregistry = registry.addInterceptor(loginInterceptor);
        //拦截路径
        loginregistry.addPathPatterns("/**");
        //排除路径
        loginregistry.excludePathPatterns("/");
        loginregistry.excludePathPatterns("/login");
        loginregistry.excludePathPatterns("/login/do");
        loginregistry.excludePathPatterns("/register");
    }
}
