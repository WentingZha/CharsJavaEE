package com.zwt.charsjavaee.g_spring_mvc.g1_basic_layers.service.impl;

import com.zwt.charsjavaee.g_spring_mvc.g1_basic_layers.cast.UserCast;
import com.zwt.charsjavaee.g_spring_mvc.g1_basic_layers.service.UserService;


public class UserServiceImpl implements UserService {

    private UserCast userCast;

    public void setUserCast(UserCast userCast) {
        this.userCast = userCast;
    }

    @Override
    public void charge() {
        userCast.charge();
    }


}
