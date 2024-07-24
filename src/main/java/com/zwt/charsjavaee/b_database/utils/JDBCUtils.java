package com.zwt.charsjavaee.b_database.utils;

import java.sql.*;


public class JDBCUtils {

    private JDBCUtils(){};

    private static String driverClass;
    private static String url;
    private static String username;
    private static String password;
    private static Connection con;

    static{
        try{



//            InputStream is = B2_DataSourceTest.class.getClassLoader().getResourceAsStream("/Users/ZhaWenting/Documents/JavaProject/CharsJavaEE/src/main/java/com/zwt/charsjavaee/config.properties");
//            Properties prop = new Properties();
//            prop.load(is);

//            driverClass = prop.getProperty("driverClass");
//            url = prop.getProperty("url");
//            username = prop.getProperty("username");
//            password = prop.getProperty("password");

            driverClass = "com.mysql.cj.jdbc.Driver";
            url = "jdbc:mysql://localhost:3306/chadb1";
            username = "root";
            password = "Abc@1234";
            Class.forName(driverClass);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Connection getConnection() {
        try {
            con = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }


    public static void close(Connection con, Statement stat, ResultSet rs) {
        if(con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection con, Statement stat) {
        close(con,stat,null);
    }
}