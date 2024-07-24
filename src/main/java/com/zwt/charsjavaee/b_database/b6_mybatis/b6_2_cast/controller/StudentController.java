package com.zwt.charsjavaee.b_database.b6_mybatis.b6_2_cast.controller;

import com.zwt.charsjavaee.Student;
import com.zwt.charsjavaee.Student1;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_2_cast.service.StudentService;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_2_cast.service.impl.StudentServiceImpl;
import org.junit.Test;

import java.util.List;

public class StudentController {
    //Create service object
    private final StudentService studentService = new StudentServiceImpl();

    @Test
    public void checkAll() {
        List<Student> students = studentService.checkAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void checkById() {
        Student1 student1 = studentService.checkById("1");
        System.out.println(student1);
    }

    @Test
    public void insert() {
        Student1 student1 = new Student1("5","5","36","80");
        Integer insert = studentService.insert(student1);
        System.out.println(insert);
    }

    @Test
    public void update() {
        Student1 student1 = new Student1("5","5","36","79");
        Integer insert = studentService.update(student1);
        System.out.println(insert);
    }

    @Test
    public void delete() {
        Integer insert = studentService.delete("5");
        System.out.println(insert);
    }
}
