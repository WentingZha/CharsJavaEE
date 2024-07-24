package com.zwt.charsjavaee.b_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class B2DataSourceTest {
    public static void main(String[] args) throws SQLException {
        B2DataSource dataSource = new B2DataSource();
        System.out.println("The size of the pool before datasource is connected: "+dataSource.getSize());
        Connection con = dataSource.getConnection();
        System.out.println(con.getClass());
        String sql = "select * from student";
        PreparedStatement statement = con.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name")+"\t"
                    +resultSet.getString("age")+"\t"
                    +resultSet.getString("score")+"\t"
            );
        }
        resultSet.close();
        statement.close();
        con.close();
        System.out.println("The size of the pool after datasource is connected: "+dataSource.getSize());
    }
}
