package com.zwt.charsjavaee.g_spring_mvc.g1_basic_layers.web;

import com.zwt.charsjavaee.g_spring_mvc.g1_basic_layers.listener.WebApplicationContextUtils;
import com.zwt.charsjavaee.g_spring_mvc.g1_basic_layers.service.UserService;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;

public class ZhaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        getService1();
    }

    private void getService(){
        //        ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext_g1.xml");
//        ServletContext servletContext = req.getServletContext();
        ServletContext servletContext = this.getServletContext();
//        ApplicationContext appContext = (ApplicationContext) servletContext.getAttribute("appContext");
        ApplicationContext appContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        UserService userService = appContext.getBean(UserService.class);
        userService.charge();
    }

    private void getService1(){
        ServletContext servletContext = this.getServletContext();
        ApplicationContext appContext = org.springframework.web.context.support.WebApplicationContextUtils.getWebApplicationContext(servletContext);
        if(appContext != null) {
            UserService userService = appContext.getBean(UserService.class);
            userService.charge();
        }
    }

}
