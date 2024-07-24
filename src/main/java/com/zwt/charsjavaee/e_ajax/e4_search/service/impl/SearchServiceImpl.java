package com.zwt.charsjavaee.e_ajax.e4_search.service.impl;

import com.zwt.charsjavaee.e_ajax.e4_search.cast.UserCast;
import com.zwt.charsjavaee.e_ajax.e4_search.chars.User;
import com.zwt.charsjavaee.e_ajax.e4_search.service.SearchService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SearchServiceImpl implements SearchService {
    @Override
    public List<User> searchLike(String userName) {
        List<User> userList = null;
        SqlSession sqlSession = null;
        InputStream is = null;
        try{

            is = Resources.getResourceAsStream("MyBatisConfig1.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sqlSession = sqlSessionFactory.openSession(true);
            UserCast cast = sqlSession.getMapper(UserCast.class);
            userList = cast.searchLike(userName);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
            if(is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return userList;
    }
}
