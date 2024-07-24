package com.zwt.charsjavaee.b_database.b6_mybatis.b6_3_interface.mapper;

import com.zwt.charsjavaee.Student;
import com.zwt.charsjavaee.Student1;

import java.util.List;

//All the method name should be the same as StudentMapper.xml
public interface StudentMapper {
    List<Student> selectAll();
    Student1 selectById(String id);
    Integer insert(Student1 student1);
    Integer update(Student1 student1);
    Integer delete(String id);
}
