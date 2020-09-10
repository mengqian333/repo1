package com.example.demo.Controller;

import com.example.demo.bean.UserBean;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    //跳转到登录页面
    @RequestMapping("/login")
    public String gologin(){
        return "login";
    }

    //登陆验证操作
    @ResponseBody
    @RequestMapping(value = "login/do",method = RequestMethod.POST)
    public String login(String name, String password, HttpServletRequest request){
        UserBean userBean = userService.login(name, password);
        if (userBean!=null){
            return "book";
        }else {
            return "error";
        }
    }

    //跳转到注册页面
    @GetMapping("/register")
    public String goregister(){
        return "register";
    }

    //注册，新增用户操作
    @PostMapping("/register/do")
    @ResponseBody
    public Map register(String name,String password){
       int num= userService.register(name, password);
       //数据库操作行数为0，说明注册失败
        Map<String,Object> map = new HashMap<String,Object>();
        if(num != 0){
            map.put("msg","新增用户成功");
            return map;
        }else {
            map.put("msg","新增用户失败");
            return map;
        }
    }



}
