package com.zwt.charsjavaee.f_spring_ioc.f1_context;

import com.zwt.charsjavaee.f_spring_ioc.f1_context.cast.UserCast;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 1. Add spring-context to pom, remember to refresh
 * 2. Create bean
 * 3. config file: applicationContext.xml
 * 4. Add a bean in the configuration file
 * 5. Create a bean using ApplicationContext
 */

public class Test {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserCast userCast = (UserCast) app.getBean("userCast");
        userCast.charge();
        System.out.println(userCast);

    }
}
