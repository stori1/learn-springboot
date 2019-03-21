package com.hjc.springboot.mybatis.controller;


import com.hjc.springboot.mybatis.entity.User;
import com.hjc.springboot.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/add")
    public boolean addUser(@RequestParam String name, @RequestParam String password){
        return service.addUser(name, password);
    }

    @RequestMapping(value = "/test")
    public String testAOP(){
        System.out.println("hello world!");
        return "hello";
    }

    @RequestMapping(value = "/get")
    public User getUser(){
        User aa = new User();
        aa.setName("hjc");
        aa.setPassword("123456");
        return aa;
    }
}
