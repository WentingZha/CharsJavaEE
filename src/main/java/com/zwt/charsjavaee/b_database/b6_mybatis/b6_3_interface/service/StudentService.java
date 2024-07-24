package com.zwt.charsjavaee.b_database.b6_mybatis.b6_3_interface.service;

import com.zwt.charsjavaee.Student;
import com.zwt.charsjavaee.Student1;

import java.util.List;

public interface StudentService {
    List<Student> selectAll();
    Student1 selectById(String id);
    Integer insert(Student1 student1);
    Integer update(Student1 student1);
    Integer delete(String id);
}
