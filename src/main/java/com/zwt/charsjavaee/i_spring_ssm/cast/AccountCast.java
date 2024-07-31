package com.zwt.charsjavaee.i_spring_ssm.cast;

import com.zwt.charsjavaee.i_spring_ssm.chars.Account;

import java.util.List;

public interface AccountCast {
    void save(Account account);
    List<Account> queryAll();
}
