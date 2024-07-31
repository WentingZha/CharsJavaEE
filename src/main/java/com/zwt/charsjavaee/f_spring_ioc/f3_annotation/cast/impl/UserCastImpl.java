package com.zwt.charsjavaee.f_spring_ioc.f3_annotation.cast.impl;

import com.zwt.charsjavaee.f_spring_ioc.f3_annotation.cast.UserCast;
import org.springframework.stereotype.Repository;

//Step1
//Use Spring inject the beans
//bean id="userCast" class="com.zwt.charsjavaee.f_spring_ioc.f3_annotation.cast.impl.UserCastImpl"/>
//@Component("userCast")
@Repository("userCast")
public class UserCastImpl implements UserCast {

    public void charge() {
        System.out.println("charge...");
    }

}
