package com.zwt.charsjavaee.h_spring_aop.h4_transaction.service.impl;

import com.zwt.charsjavaee.h_spring_aop.h4_transaction.cast.AccountCast;
import com.zwt.charsjavaee.h_spring_aop.h4_transaction.service.AccountService;

public class AccountServiceImpl implements AccountService {

    private AccountCast accountCast;
    public void setAccountCast(AccountCast accountCast) {
        this.accountCast = accountCast;
    }

    public void transfer(String outMan, String inMan, double money) {
        accountCast.out(outMan,money);
        //Test transaction
        int i = 1/0;
        accountCast.in(inMan,money);
    }
}
