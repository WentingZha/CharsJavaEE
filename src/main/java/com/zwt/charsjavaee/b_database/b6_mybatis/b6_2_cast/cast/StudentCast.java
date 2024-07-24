package com.zwt.charsjavaee.b_database.b6_mybatis.b6_2_cast.cast;

import com.zwt.charsjavaee.Student;
import com.zwt.charsjavaee.Student1;

import java.util.List;

public interface StudentCast {
    List<Student> checkAll();
    Student1 checkById(String id);
    Integer insert(Student1 student1);
    Integer update(Student1 student1);
    Integer delete(String id);
}
