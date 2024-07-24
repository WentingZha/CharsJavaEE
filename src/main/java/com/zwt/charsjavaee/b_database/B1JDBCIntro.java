package com.zwt.charsjavaee.b_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class B1JDBCIntro {
    public static void main(String[] args) throws Exception{
        //Import mysql-connector into /lib
        /*
        *   To start MySQL server: sudo systemctl start mysqld;
            To stop MySQL server: sudo systemctl stop mysqld;
            To restart MySQL server: sudo systemctl restart mysqld;
        */

        //Register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Get Connection: ipconfig getifaddr en1
        //CREATE USER 'caamanting'@'localhost' IDENTIFIED BY 'Abc@1234';
        //GRANT ALL ON *.* TO 'caamanting'@'localhost';
        //FLUSH PRIVILEGES;

        /*
        *use mysql;
        *update user set host='%' where user ='root';
        *select host,user from user;
        */
//        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.1.140:3306/chadb1", "root", "Abc@1234");
//        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/chadb1", "root", "Abc@1234");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chadb1?user=root&password=Abc@1234");

        //Get executor object
        Statement statement = conn.createStatement();
        //Run sql sentences
        String sql = "select * from bookstore";
        ResultSet resultSet = statement.executeQuery(sql);
        //Deal with the result
        while (resultSet.next()){
            System.out.println(resultSet.getInt("ID")+"\t"+resultSet.getString("name"));
        }
        //Release resource
        conn.close();
        statement.close();
        conn.close();
    }
}
