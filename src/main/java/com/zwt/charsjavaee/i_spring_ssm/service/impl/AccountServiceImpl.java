package com.zwt.charsjavaee.i_spring_ssm.service.impl;

import com.zwt.charsjavaee.i_spring_ssm.cast.AccountCast;
import com.zwt.charsjavaee.i_spring_ssm.chars.Account;
import com.zwt.charsjavaee.i_spring_ssm.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public void save(Account account) {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig_i.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = build.openSession();
            AccountCast mapper = sqlSession.getMapper(AccountCast.class);
            mapper.save(account);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Account> queryAll() {

        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig_i.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = build.openSession();
            AccountCast mapper = sqlSession.getMapper(AccountCast.class);
            List<Account> accounts = mapper.queryAll();
            sqlSession.close();
            return accounts;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
