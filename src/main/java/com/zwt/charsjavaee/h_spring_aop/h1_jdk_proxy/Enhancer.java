package com.zwt.charsjavaee.h_spring_aop.h1_jdk_proxy;

public class Enhancer {

    public void enhanceBefore(){
        System.out.println("Enhance before");
    }

    public void afterReturning(){
        System.out.println("After Returning");
    }

}
