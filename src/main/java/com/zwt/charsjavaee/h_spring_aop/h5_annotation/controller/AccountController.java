package com.zwt.charsjavaee.h_spring_aop.h5_annotation.controller;

import com.zwt.charsjavaee.h_spring_aop.h5_annotation.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountController {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("appContext_h5.xml");
        AccountService accountService = app.getBean(AccountService.class);
        accountService.transfer("caamanting","HWH",100);
    }

}
