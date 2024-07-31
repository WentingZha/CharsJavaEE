package com.zwt.charsjavaee.f_spring_ioc.f2_datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Test2 {

    //C3p0
//    @Test
    public void test1() throws PropertyVetoException, SQLException {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
        cpds.setJdbcUrl("jdbc:mysql://localhost:3306/chadb2");
        cpds.setUser("root");
        cpds.setPassword("Abc@1234");
        Connection connection = cpds.getConnection();
        System.out.println(connection);
        connection.close();
    }

    //Manually create c3p0 datasource (load properties file)
//    @Test
    public void test2() throws PropertyVetoException, SQLException {
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");
        String driver = rb.getString("driver");
        String url = rb.getString("url");
        String user = rb.getString("username");
        String password = rb.getString("password");

        ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setDriverClass(driver);
        cpds.setJdbcUrl(url);
        cpds.setUser(user);
        cpds.setPassword(password);
        Connection connection = cpds.getConnection();
        System.out.println(connection);
        connection.close();
    }

    //Spring container generate the datasource
    @Test
    public void test3() throws SQLException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("appContext_f2.xml");
        DataSource dataSource = ac.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
