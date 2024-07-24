package com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean;

import java.util.List;

public class Pupil {
    private Integer pupilId;
    private String name;
    private Integer age;
    private List<Course> courses;

    public Pupil() {
    }

    public Pupil(Integer pupilId, String name, Integer age, List<Course> courses) {
        this.pupilId = pupilId;
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    public Integer getPupilId() {
        return pupilId;
    }

    public void setPupilId(Integer pupilId) {
        this.pupilId = pupilId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Pupil1{" +
                "pupilId=" + pupilId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", courses=" + courses +
                '}';
    }
}
