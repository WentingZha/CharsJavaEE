package com.zwt.charsjavaee.b_database.b6_mybatis.b6_2_cast.service.impl;

import com.zwt.charsjavaee.Student;
import com.zwt.charsjavaee.Student1;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_2_cast.cast.StudentCast;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_2_cast.cast.impl.StudentCastImpl;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_2_cast.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    //Create persistence object
    private final StudentCast cast = new StudentCastImpl();

    @Override
    public List<Student> checkAll() {
        return cast.checkAll();
    }

    @Override
    public Student1 checkById(String id) {
        return cast.checkById(id);
    }

    @Override
    public Integer insert(Student1 student1) {
        return cast.insert(student1);
    }

    @Override
    public Integer update(Student1 student1) {
        return cast.update(student1);
    }

    @Override
    public Integer delete(String id) {
        return cast.delete(id);
    }
}
