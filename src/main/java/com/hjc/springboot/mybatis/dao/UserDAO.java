package com.hjc.springboot.mybatis.dao;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {

    boolean insertUser(@Param("name") String name, @Param("password") String password);
}
