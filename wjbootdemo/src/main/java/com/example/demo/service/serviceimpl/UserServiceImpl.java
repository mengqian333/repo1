package com.example.demo.service.serviceimpl;

import com.example.demo.bean.UserBean;
import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    //登陆验证
    @Override
    public UserBean login(String name, String password) {
        return userDao.getInfo(name, password);
    }

    //注册，新增用户
    @Override
    public int register(String name, String password) {
        return userDao.addUser(name, password);
    }
}
