package com.zwt.charsjavaee.b_database.b6_mybatis.b6_4_dynamic_sql;

import com.zwt.charsjavaee.Student1;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_4_dynamic_sql.cast.StudentCast;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class Test1 {
//    @Test
    public void checkWithMultiCondition() throws Exception {

        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        StudentCast cast = sqlSession.getMapper(StudentCast.class);
        Student1 student1 = new Student1();
        student1.setSid("2");
        student1.setName("GLZ");
//        student1.setAge("56");
        List<Student1> students = cast.checkWithMultiCondition(student1);
        for (Student1 student : students) {
            System.out.println(student);
        }
        sqlSession.close();
        resourceAsStream.close();

    }

    @org.junit.Test
    public void selectByIds() throws Exception {

        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        StudentCast cast = sqlSession.getMapper(StudentCast.class);
        List<String> ids = new ArrayList<>();
        ids.add("1");
        ids.add("2");
        List<Student1> students = cast.checkByIds(ids);
        for (Student1 student : students) {
            System.out.println(student);
        }
        sqlSession.close();
        resourceAsStream.close();

    }
}