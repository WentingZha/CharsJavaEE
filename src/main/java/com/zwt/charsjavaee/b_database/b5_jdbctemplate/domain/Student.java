package com.zwt.charsjavaee.b_database.b5_jdbctemplate.domain;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private String age;
    private String score;

    public Student() {
    }

    public Student(String name, String age, String score) {
        this.name = name;
        this.age = age;
        this.score = score;
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


}
