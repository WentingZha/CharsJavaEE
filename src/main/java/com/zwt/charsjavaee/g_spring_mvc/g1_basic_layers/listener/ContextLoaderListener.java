package com.zwt.charsjavaee.g_spring_mvc.g1_basic_layers.listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {

        ServletContext servletContext = sce.getServletContext();
        //Load the global params in xml
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
        ApplicationContext appContext = new ClassPathXmlApplicationContext(contextConfigLocation);
        //Store the context to the field of ServletContext
        servletContext.setAttribute("appContext", appContext);
        System.out.println("Springer container is created");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }
}
