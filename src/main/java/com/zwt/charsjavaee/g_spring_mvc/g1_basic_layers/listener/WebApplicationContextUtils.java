package com.zwt.charsjavaee.g_spring_mvc.g1_basic_layers.listener;

import jakarta.servlet.ServletContext;
import org.springframework.context.ApplicationContext;

public class WebApplicationContextUtils {

    public static ApplicationContext getWebApplicationContext(ServletContext servletContext){
        return (ApplicationContext) servletContext.getAttribute("appContext");
    }

}
