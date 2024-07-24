package com.zwt.charsjavaee.b_database.b6_mybatis.b6_8_annotation;

import com.zwt.charsjavaee.Student1;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean.Card;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean.Classes;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean.Pupil;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_8_annotation.cast.StudentCast;
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

public class Test5 {

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

        Student1 student1 = new Student1("1","ZWT","36","100");
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

        Student1 student1 = new Student1("1","Au","84","50");
        Student1 student2 = new Student1("2","Kam","80","40");
        Student1 student3 = new Student1("3","Sun","54","50");

        cast.edit(student1);
        cast.edit(student2);
        cast.edit(student3);

        sqlSession.close();
        resourceAsStream.close();

    }

//    @Test
    public void remove() throws Exception {

        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        StudentCast cast = sqlSession.getMapper(StudentCast.class);
        Integer remove = cast.remove("5");
        System.out.println(remove);
        sqlSession.close();
        resourceAsStream.close();

    }

//    @Test
    public void checkAllCards() throws Exception {

        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        CardCast cast = sqlSession.getMapper(CardCast.class);
        for (Card card : cast.checkAll()) {
            System.out.println(card);
        }

        sqlSession.close();
        resourceAsStream.close();

    }


//    @Test
    public void checkAllClasses() throws Exception {

        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        ClassesCast cast = sqlSession.getMapper(ClassesCast.class);
        for (Classes item : cast.checkAll()) {
            System.out.println(item);
        }

        sqlSession.close();
        resourceAsStream.close();

    }


//    @Test
    public void checkAllCourses() throws Exception {

        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        PupilsCast cast = sqlSession.getMapper(PupilsCast.class);
        for (Pupil item : cast.checkAll()) {
            System.out.println(item);
        }

        sqlSession.close();
        resourceAsStream.close();

    }

}
