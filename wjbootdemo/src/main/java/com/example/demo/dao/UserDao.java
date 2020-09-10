package com.example.demo.dao;

import com.example.demo.bean.BookBean;
import com.example.demo.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    //登录验证
    UserBean getInfo(String name ,String password);

    //注册，新增用户
    int addUser(String name,String password);

}
