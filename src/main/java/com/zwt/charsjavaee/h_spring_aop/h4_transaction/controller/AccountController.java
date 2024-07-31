package com.zwt.charsjavaee.h_spring_aop.h4_transaction.controller;

import com.zwt.charsjavaee.h_spring_aop.h4_transaction.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountController {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("appContext_h4.xml");
        AccountService accountService = app.getBean(AccountService.class);
        accountService.transfer("caamanting","HWH",100);
    }

}
