package com.hjc.springboot.mybatis.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAop {

    @Before("execution(* com.hjc.springboot.mybatis.controller.UserController.testAOP())")
    public void beforeMethod(){
        System.out.println("*****before*****");
    }


    @After("execution(* com.hjc.springboot.mybatis.controller.UserController.testAOP())")
    public void afterMethod(){
        System.out.println("*****after*****");
    }
}
