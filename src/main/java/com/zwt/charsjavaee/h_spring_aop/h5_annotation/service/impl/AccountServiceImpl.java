package com.zwt.charsjavaee.h_spring_aop.h5_annotation.service.impl;

import com.zwt.charsjavaee.h_spring_aop.h5_annotation.cast.AccountCast;
import com.zwt.charsjavaee.h_spring_aop.h5_annotation.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
//@Transactional(isolation = Isolation.READ_COMMITTED)
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountCast accountCast;

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public void transfer(String out, String in, double money) {
        accountCast.out(out,money);
        //Test transaction
        int i = 1/0;
        accountCast.in(in,money);
    }


}
