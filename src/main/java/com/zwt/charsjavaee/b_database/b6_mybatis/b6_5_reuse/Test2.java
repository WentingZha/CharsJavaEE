package com.zwt.charsjavaee.b_database.b6_mybatis.b6_5_reuse;

import com.zwt.charsjavaee.Student1;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_5_reuse.cast.StudentCast;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


public class Test2 {
    @Test
    public void checkAll() throws Exception {
        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        StudentCast cast = sqlSession.getMapper(StudentCast.class);
        List<Student1> students = cast.checkAll();
        for (Student1 student : students) {
            System.out.println(student);
        }
        sqlSession.close();
        resourceAsStream.close();
    }
}