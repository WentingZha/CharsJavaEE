package com.zwt.charsjavaee.e_ajax.e5_paging.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zwt.charsjavaee.Student1;
import com.zwt.charsjavaee.e_ajax.e5_paging.cast.NewsCast;
import com.zwt.charsjavaee.e_ajax.e5_paging.chars.News;
import com.zwt.charsjavaee.e_ajax.e5_paging.service.NewsService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class NewsServiceImpl implements NewsService {
    private Page<News> page;

    @Override
    public PageInfo pagingQuery(Integer start, Integer pageSize) {
        InputStream is = null;
        SqlSession sqlSession = null;
        PageInfo<News> info = null;
        try{
            is = Resources.getResourceAsStream("MyBatisConfig1.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sqlSession = sqlSessionFactory.openSession(true);
            NewsCast cast = sqlSession.getMapper(NewsCast.class);
            PageHelper.startPage(start,pageSize);
            List<News> news = cast.checkAll();
            info = new PageInfo<>(news);

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
        return info;
    }
}
