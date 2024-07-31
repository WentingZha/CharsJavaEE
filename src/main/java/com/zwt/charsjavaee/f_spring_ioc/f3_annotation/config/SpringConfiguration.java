package com.zwt.charsjavaee.f_spring_ioc.f3_annotation.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

//Core configuration class
@Configuration
//    <context:component-scan base-package="com.zwt.charsjavaee.f_spring_ioc.f3_annotation"/>
@ComponentScan("com.zwt.charsjavaee.f_spring_ioc.f3_annotation")
// <import resource=""/>
//Multi-configuration: {DataSourceConfiguration.class,XXX.class}
@Import(DataSourceConfiguration.class)
public class SpringConfiguration {

    @Bean("dataSource")
    public DataSource getDataSource() throws PropertyVetoException {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
        cpds.setJdbcUrl("jdbc:mysql://localhost:3306/chadb2");
        cpds.setUser("root");
        cpds.setPassword("Abc@1234");
        return cpds;
    }


}
