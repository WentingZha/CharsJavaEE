package com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation;

import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean.Card;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean.Classes;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean.Pupil;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.cast.ManyToManyCast;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.cast.OneManyCast;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.cast.OneOneCast;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class Test4 {

    @Test
    public void checkAll1() throws Exception {

        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        OneOneCast cast = sqlSession.getMapper(OneOneCast.class);

        List<Card> cards = cast.checkAll();
        for (Card card : cards) {
            System.out.println(card);
        }

        sqlSession.close();
        resourceAsStream.close();

    }

    @Test
    public void checkAll2() throws Exception {

        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        OneManyCast cast = sqlSession.getMapper(OneManyCast.class);

        List<Classes> classes = cast.checkAll();
        for (Classes c : classes) {
            System.out.println(c.getId());
            System.out.println(c.getName());
            for (Pupil pupil : c.getPupils()) {
                System.out.println(pupil);
            }
        }

        sqlSession.close();
        resourceAsStream.close();

    }

    @Test
    public void checkAll3() throws Exception {

        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatisConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        ManyToManyCast cast = sqlSession.getMapper(ManyToManyCast.class);

        List<Pupil> pupils = cast.checkAll();
        for (Pupil p : pupils) {
            System.out.println(p);
        }

        sqlSession.close();
        resourceAsStream.close();

    }
}
