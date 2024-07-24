package com.zwt.charsjavaee.b_database.b6_mybatis.b6_6_carrier;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zwt.charsjavaee.Student1;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_6_carrier.cast.StudentCast;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


public class Test3 {

    @Test
    public void carrier() throws Exception {

        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        StudentCast cast = sqlSession.getMapper(StudentCast.class);

        //add library: pagehelper.jar,jsqlparser.jar
        //Carrier1: 2 items
//        PageHelper.startPage(1,2);
        //Carrier2: 2 items
//        PageHelper.startPage(2,2);
        //Carrier3
        PageHelper.startPage(3,2);

        List<Student1> students = cast.checkAll();
        for (Student1 student : students) {
            System.out.println(student);
        }

        //Paging parameters
        PageInfo<Student1> info = new PageInfo<>(students);
        System.out.println("Total items:"+info.getTotal());
        System.out.println("Total carriers:"+info.getPages());
        System.out.println("Current carrier:"+info.getPageNum());
        System.out.println("items in each carrier:"+info.getPageSize());
        System.out.println("previous carrier:"+info.getPrePage());
        System.out.println("next carrier:"+info.getNextPage());
        System.out.println("is First carrier:"+info.isIsFirstPage());
        System.out.println("is last carrier:"+info.isIsLastPage());

        sqlSession.close();
        resourceAsStream.close();

    }
}