package com.zwt.charsjavaee.f_spring_ioc.f1_context.cast.impl;

import com.zwt.charsjavaee.f_spring_ioc.f1_context.cast.User;
import com.zwt.charsjavaee.f_spring_ioc.f1_context.cast.UserCast;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserCastImpl implements UserCast {

    private String name;
    private int age;
    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public UserCastImpl() {
        System.out.println("UserCastImpl is constructed");
    }

    //LifeCycle
    public void init(){
        System.out.println("UserCastImpl init");
    }

    //LifeCycle
    public void destroy(){
        System.out.println("UserCastImpl destroy");
    }

    @Override
    public void charge() {
        System.out.println("charge");
        System.out.println("UserCastImpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}');

        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
    }

}
