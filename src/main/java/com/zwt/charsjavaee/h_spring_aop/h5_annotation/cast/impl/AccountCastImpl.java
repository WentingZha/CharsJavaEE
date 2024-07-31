package com.zwt.charsjavaee.h_spring_aop.h5_annotation.cast.impl;

import com.zwt.charsjavaee.h_spring_aop.h5_annotation.cast.AccountCast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("accountCast")
public class AccountCastImpl implements AccountCast {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void out(String out, double money) {
        jdbcTemplate.update("update account set money=money-? where name=?",money, out);
    }

    public void in(String in, double money) {
        jdbcTemplate.update("update account set money=money+? where name=?",money, in);
    }
}
