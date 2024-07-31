package com.zwt.charsjavaee.h_spring_aop.h2_cglib_proxy;

public class Advice {

    public void enhanceBefore(){
        System.out.println("enhance before 1");
    }

    public void afterReturning(){
        System.out.println("after returning 1");
    }

}
