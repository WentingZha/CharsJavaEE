package com.zwt.charsjavaee.f_spring_ioc.f1_context.service.impl;

import com.zwt.charsjavaee.f_spring_ioc.f1_context.cast.UserCast;
import com.zwt.charsjavaee.f_spring_ioc.f1_context.service.UserService;

public class UserServiceImpl2 implements UserService {

    private UserCast userCast;

    public UserServiceImpl2() {
    }

    public UserServiceImpl2(UserCast userCast) {
        this.userCast = userCast;
    }


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
