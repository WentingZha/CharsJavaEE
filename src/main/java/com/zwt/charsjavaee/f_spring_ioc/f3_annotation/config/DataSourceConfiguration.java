package com.zwt.charsjavaee.f_spring_ioc.f3_annotation.config;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

// <context:property-placeholder location="classpath:jdbc1.properties"/>
@PropertySource("classpath:jdbc1.properties")
public class DataSourceConfiguration {
    @Value("${driver}")
    private String driver;

    @Value("${url}")
    private String url;

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @Bean("dataSource")
    public DataSource getDataSource1() throws PropertyVetoException {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setDriverClass(driver);
        cpds.setJdbcUrl(url);
        cpds.setUser(username);
        cpds.setPassword(password);
        return cpds;
    }
}
