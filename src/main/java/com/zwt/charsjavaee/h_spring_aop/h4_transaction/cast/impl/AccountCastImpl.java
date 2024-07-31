package com.zwt.charsjavaee.h_spring_aop.h4_transaction.cast.impl;

import com.zwt.charsjavaee.h_spring_aop.h4_transaction.cast.AccountCast;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountCastImpl implements AccountCast {

    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void out(String outMan, double money) {
        jdbcTemplate.update("update account set money=money-? where name=?",money,outMan);
    }

    public void in(String inMan, double money) {
        jdbcTemplate.update("update account set money=money+? where name=?",money,inMan);
    }
}
