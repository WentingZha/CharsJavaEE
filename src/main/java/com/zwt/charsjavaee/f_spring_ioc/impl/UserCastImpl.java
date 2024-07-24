package com.zwt.charsjavaee.f_spring_ioc.impl;

import com.zwt.charsjavaee.f_spring_ioc.UserCast;

public class UserCastImpl implements UserCast {
    @Override
    public void charge() {
        System.out.println("charge");
    }
}
