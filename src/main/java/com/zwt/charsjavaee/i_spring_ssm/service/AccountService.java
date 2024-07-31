package com.zwt.charsjavaee.i_spring_ssm.service;

import com.zwt.charsjavaee.i_spring_ssm.chars.Account;

import java.util.List;


public interface AccountService {
    void save(Account account);
    List<Account> queryAll();
}
