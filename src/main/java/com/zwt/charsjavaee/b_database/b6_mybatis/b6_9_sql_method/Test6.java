package com.zwt.charsjavaee.b_database.b6_mybatis.b6_9_sql_method;

import com.zwt.charsjavaee.Student1;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean.Card;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean.Classes;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean.Pupil;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_9_sql_method.cast.StudentCast;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_8_annotation.multi_to_multi_cast.PupilsCast;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_8_annotation.one_multi_cast.ClassesCast;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_8_annotation.one_one_cast.CardCast;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class Test6 {

    @Test
    public void checkAll1() throws Exception {

        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        StudentCast cast = sqlSession.getMapper(StudentCast.class);

        List<Student1> list = cast.checkAll();
        for (Student1 student1 : list) {
            System.out.println(student1);
        }

        sqlSession.close();
        resourceAsStream.close();

    }

//    @Test
    public void insert() throws Exception {

        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        StudentCast cast = sqlSession.getMapper(StudentCast.class);

        Student1 student1 = new Student1("5","ZWT","36","100");
        Integer insert = cast.insert(student1);
        System.out.println(insert);
        sqlSession.close();
        resourceAsStream.close();

    }

//    @Test
    public void edit() throws Exception {

        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        StudentCast cast = sqlSession.getMapper(StudentCast.class);

        Student1 student1 = new Student1("1","ZWT","36","90");

        cast.edit(student1);

        sqlSession.close();
        resourceAsStream.close();

    }

//    @Test
    public void remove() throws Exception {

        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        StudentCast cast = sqlSession.getMapper(StudentCast.class);
        cast.remove("5");
        sqlSession.close();
        resourceAsStream.close();

    }


}
