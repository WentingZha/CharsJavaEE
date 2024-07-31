package com.zwt.charsjavaee.f_spring_ioc.f1_context.service.impl;

import com.zwt.charsjavaee.f_spring_ioc.f1_context.cast.UserCast;
import com.zwt.charsjavaee.f_spring_ioc.f1_context.service.UserService;

public class UserServiceImpl1 implements UserService {

    private UserCast userCast;

    public void setUserCast(UserCast userCast) {
        this.userCast = userCast;
    }

    @Override
    public void charge() {
//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserCast userCast = (UserCast) app.getBean("userCast");
//        userCast.charge();
        userCast.charge();
    }
}
