package com.zwt.charsjavaee.b_database.b6_mybatis.b6_1_data_cast_obj;

import com.zwt.charsjavaee.Student;
import com.zwt.charsjavaee.Student1;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/*
B6_1: Basic data cast object
* Steps:
* 1. mybatis.jar, mysql-connector.jar
* 2. Mapper and Configuration file
* 3. Test API
*/
public class MyBatisTest1 {
    @Test
    public void selectAll() throws Exception {
//        InputStream is = Resources.getResourceAsStream("MyBatisConfig.xml");
        InputStream is = MyBatisTest1.class.getClassLoader().getResourceAsStream("MyBatisConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<Student> studentList = sqlSession.selectList("StudentMapper.selectAll");

        for (Student student : studentList) {
            System.out.println(student.getName());
        }

        sqlSession.close();
        is.close();
    }

    @Test
    public void selectById() throws IOException {
        //Load configuration file

        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        //parameter1: mapper file name . function name
        Student1 student = sqlSession.selectOne("StudentMapper.selectById", "1");
        System.out.println(student);
        resourceAsStream.close();

    }


    public void insert() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //Commit transaction automatically
        SqlSession sqlSession = build.openSession(true);
        Student1 stu = new Student1("6", "10", "60", "60");
        int result = sqlSession.insert("StudentMapper.insert", stu);
        System.out.println(result);
        resourceAsStream.close();
    }


    public void update() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        Student1 stu = new Student1("5", "10", "60", "50");
        int result = sqlSession.update("StudentMapper.update", stu);
        //Commit transaction
        sqlSession.commit();
        System.out.println(result);
        resourceAsStream.close();
    }


    public void delete() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        int result = sqlSession.delete("StudentMapper.delete", "5");
        //Commit transaction
        sqlSession.commit();
        System.out.println(result);
        resourceAsStream.close();
    }
}