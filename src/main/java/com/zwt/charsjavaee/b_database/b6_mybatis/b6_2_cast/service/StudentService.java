package com.zwt.charsjavaee.b_database.b6_mybatis.b6_2_cast.service;

import com.zwt.charsjavaee.Student;
import com.zwt.charsjavaee.Student1;

import java.util.List;

public interface StudentService {
    public abstract List<Student> checkAll();
    public abstract Student1 checkById(String id);
    public abstract Integer insert(Student1 student1);
    public abstract Integer update(Student1 student1);
    public abstract Integer delete(String id);
}
