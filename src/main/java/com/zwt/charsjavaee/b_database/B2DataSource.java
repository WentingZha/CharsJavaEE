package com.zwt.charsjavaee.b_database;

import com.zwt.charsjavaee.b_database.utils.JDBCUtils;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class B2DataSource implements DataSource {
    //Prepare the container, store several connection object
    private static List<Connection> pool = Collections.synchronizedList(new ArrayList<>());
    //Define static code block, get 5 objects
    static {
//        try {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        for(int i = 1; i <= 5; i++) {
//                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chadb1?user=root&password=Abc@1234");
//                pool.add(conn);
//            }
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        for(int i = 1; i <= 5; i++) {
            Connection con = JDBCUtils.getConnection();
            pool.add(con);
        }

    }
    //B2: Override getConnection(), obtain one connection object
//    @Override
//    public Connection getConnection() throws SQLException {
//        if(!pool.isEmpty()){
//            return pool.remove(0);
//        }else {
//            throw new RuntimeException("Connection Pool is empty");
//        }
//    }

    //B3: A customized Connection
//    @Override
//    public Connection getConnection() throws SQLException {
//        if(!pool.isEmpty()){
//            Connection conn = pool.remove(0);
//            B3Connection1 connection1 = new B3Connection1(conn,pool);
//            B3Connection2 connection2 = new B3Connection2(conn,pool);
//            return connection2;
//        }else {
//            throw new RuntimeException("Connection Pool is empty");
//        }
//    }

    //B4 Proxy
    @Override
    public Connection getConnection() throws SQLException {
        if(!pool.isEmpty()){
            Connection conn = pool.remove(0);
            Connection connProxy  = (Connection) Proxy.newProxyInstance(
                    conn.getClass().getClassLoader(),
                    new Class[]{Connection.class},
                    new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            if(method.getName().equals("close")){
                                pool.add(conn);
                                return null;
                            }else {
                                return method.invoke(conn,args);
                            }
                        }
                    }
            );
            return connProxy;
        }else {
            throw new RuntimeException("Connection Pool is empty");
        }
    }

    //Define getSize() to get the size of the container
    public int getSize() {
        return pool.size();
    }


    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
