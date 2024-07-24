package com.zwt.charsjavaee.b_database.b6_mybatis.b6_3_interface.service.impl;

import com.zwt.charsjavaee.Student;
import com.zwt.charsjavaee.Student1;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_3_interface.mapper.StudentMapper;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_3_interface.service.StudentService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class StudentServiceImpl implements StudentService {


    @Override
    public List<Student> selectAll() {
        List<Student> students = null;
        SqlSession sqlSession = null;
        InputStream is = null;
        try{

            is = Resources.getResourceAsStream("MyBatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sqlSession = sqlSessionFactory.openSession(true);
            //StudentCast cast = new StudentCastImpl();
            StudentMapper cast = sqlSession.getMapper(StudentMapper.class);
            students = cast.selectAll();

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

        return students;
    }

    @Override
    public Student1 selectById(String id) {
        Student1 student = null;
        SqlSession sqlSession = null;
        InputStream is = null;
        try{
            is = Resources.getResourceAsStream("MyBatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sqlSession = sqlSessionFactory.openSession(true);
            //StudentCast cast = new StudentCastImpl();
            StudentMapper cast = sqlSession.getMapper(StudentMapper.class);
            student = cast.selectById(id);

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

        return student;
    }

    @Override
    public Integer insert(Student1 student1) {
        Integer result = null;
        SqlSession sqlSession = null;
        InputStream is = null;
        try{
            is = Resources.getResourceAsStream("MyBatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sqlSession = sqlSessionFactory.openSession(true);
            //StudentCast cast = new StudentCastImpl();
            StudentMapper cast = sqlSession.getMapper(StudentMapper.class);
            result = cast.insert(student1);

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

        return result;
    }

    @Override
    public Integer update(Student1 student1) {
        Integer result = null;
        SqlSession sqlSession = null;
        InputStream is = null;
        try{
            is = Resources.getResourceAsStream("MyBatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sqlSession = sqlSessionFactory.openSession(true);
            //StudentCast cast = new StudentCastImpl();
            StudentMapper cast = sqlSession.getMapper(StudentMapper.class);
            result = cast.update(student1);

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

        return result;
    }

    @Override
    public Integer delete(String id) {
        Integer result = null;
        SqlSession sqlSession = null;
        InputStream is = null;
        try{
            is = Resources.getResourceAsStream("MyBatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sqlSession = sqlSessionFactory.openSession(true);
            //StudentCast cast = new StudentCastImpl();
            StudentMapper cast = sqlSession.getMapper(StudentMapper.class);
            result = cast.delete(id);

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

        return result;
    }
}
