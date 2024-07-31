package com.zwt.charsjavaee.h_spring_aop.h3_xml_based_aop;

import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;

public class MyAspect {
    public void before(){
        System.out.println("before method");
    }

    public void afterReturning(){
        System.out.println("after returning method");
    }

//    public Object around(MethodInvocationProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("around before method");
//        Object proceed = joinPoint.proceed();
//        System.out.println("around after returning method");
//        return proceed;
//    }


    public void throwing(){
        System.out.println("throwing method");
    }

    public void after(){
        System.out.println("after method");
    }
}
