package com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean;

import java.util.List;

public class Classes {
    private Integer id;
    private String name;

    private List<Pupil> pupils;

    public Classes() {
    }

    public Classes(Integer id, String name, List<Pupil> pupils) {
        this.id = id;
        this.name = name;
        this.pupils = pupils;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pupil> getPupils() {
        return pupils;
    }

    public void setPupils(List<Pupil> pupils) {
        this.pupils = pupils;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + pupils +
                '}';
    }
}
