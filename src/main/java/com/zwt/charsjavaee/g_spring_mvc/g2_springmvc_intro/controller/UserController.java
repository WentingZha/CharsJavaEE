package com.zwt.charsjavaee.g_spring_mvc.g2_springmvc_intro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

//    @RequestMapping("/CharsJavaEE_war_exploded/charge")
    @RequestMapping("/charge")
    public String charge(){
        System.out.println("Controller charge");
//        return "forward:/success.jsp";
        return "success.jsp";
    }

    @RequestMapping(value = "/success1")
    public ModelAndView charge1(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
