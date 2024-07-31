package com.zwt.charsjavaee.h_spring_aop.h1_jdk_proxy;

public class Target implements TargetInterface{
    @Override
    public void buildCabin() {
        System.out.println("build a cabin");
    }
}
