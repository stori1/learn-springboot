package com.hjc.springboot.mybatis.service;


import com.hjc.springboot.mybatis.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDAO dao;

    public boolean addUser(String name, String password){
        return dao.insertUser(name,password);
    }
}
