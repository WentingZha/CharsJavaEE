package com.zwt.charsjavaee.f_spring_ioc.f3_annotation.service.impl;

import com.zwt.charsjavaee.f_spring_ioc.f3_annotation.cast.UserCast;
import com.zwt.charsjavaee.f_spring_ioc.f3_annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//Step2
// <bean id="userService" class="com.zwt.charsjavaee.f_spring_ioc.f3_annotation.service.impl.UserServiceImpl">
//@Component("userService")
@Service("userService")
//@Scope("prototype")
@Scope("singleton")
public class UserServiceImpl implements UserService {

    //Step3
    // <property name="userCast" ref="userCast"/>
    @Autowired
    //If component-scan find the UserCast type data, @Qualifier can be deleted
    //@Qualifier: match id in the container, should be used with  @Autowired
    @Qualifier("userCast")
    private UserCast userCast;

    //Set method can be deleted if using spring ioc annotation
    //It is necessary if you write the configuration in the xml
//    public void setUserCast(UserCast userCast) {
//        this.userCast = userCast;
//    }

    @Value("${driver}")
    private String driver;

    @Override
    public void charge() {
        userCast.charge();
        System.out.println("Driver: "+driver);
    }


}
