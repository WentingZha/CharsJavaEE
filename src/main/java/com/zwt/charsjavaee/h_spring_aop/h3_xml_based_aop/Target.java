package com.zwt.charsjavaee.h_spring_aop.h3_xml_based_aop;

public class Target implements TargetInterface {
    @Override
    public void buildCabin() {
//        int i = 1/0;
        System.out.println("build a cabin");
    }
}
