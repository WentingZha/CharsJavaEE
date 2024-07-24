package com.zwt.charsjavaee;

import java.io.Serializable;

public class Student1 implements Serializable {

    private String sid;
    private String name;
    private String age;
    private String score;

    public Student1() {
    }

    public Student1(String sid,String name, String age, String score) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getSid() {
        return sid;
    }

    public void  setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
