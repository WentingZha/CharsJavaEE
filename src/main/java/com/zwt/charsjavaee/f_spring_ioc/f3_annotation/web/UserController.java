package com.zwt.charsjavaee.f_spring_ioc.f3_annotation.web;

import com.zwt.charsjavaee.f_spring_ioc.f3_annotation.config.SpringConfiguration;
import com.zwt.charsjavaee.f_spring_ioc.f3_annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        annotationInject2();

    }

    private static void annotationInject1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext_f2.xml");
        //User 'getBean(Class<T> requiredType)' if only one service exists
        UserService service = applicationContext.getBean(UserService.class);
        service.charge();
    }

    private static void annotationInject2() {
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService service = app.getBean(UserService.class);
        service.charge();
    }
}
