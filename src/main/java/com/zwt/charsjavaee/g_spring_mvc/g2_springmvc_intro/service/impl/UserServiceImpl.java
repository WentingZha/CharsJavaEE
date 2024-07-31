package com.zwt.charsjavaee.g_spring_mvc.g2_springmvc_intro.service.impl;

import com.zwt.charsjavaee.g_spring_mvc.g2_springmvc_intro.cast.UserCast;
import com.zwt.charsjavaee.g_spring_mvc.g2_springmvc_intro.service.UserService;


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
