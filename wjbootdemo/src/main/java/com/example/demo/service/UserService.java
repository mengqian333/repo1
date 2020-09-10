package com.example.demo.service;

import com.example.demo.bean.UserBean;

import java.util.Map;


public interface UserService {

    //登录验证
    UserBean login(String name, String password);

    //注册，新增用户
    int register(String name,String password);

}
