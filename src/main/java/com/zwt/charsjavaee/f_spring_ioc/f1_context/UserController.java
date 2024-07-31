package com.zwt.charsjavaee.f_spring_ioc.f1_context;

import com.zwt.charsjavaee.f_spring_ioc.f1_context.cast.UserCast;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        creatClassPathAppContext();

    }

    private static void creatClassPathAppContext() {
//        UserService userService = new UserServiceImpl();
//        userService.charge();

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserCast userCast = (UserCast) app.getBean("userCast");
        userCast.charge();

        //Remember to change the bean tag in the applicationContext
//        UserService userService = app.getBean(UserService.class);
//        userService.charge();
    }

    private static void createFileSystemXmlAppContext() {
        //Absolute path
//        FileSystemXmlApplicationContext app = new FileSystemXmlApplicationContext("applicationContext.xml");
    }
}
