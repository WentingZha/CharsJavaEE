package com.zwt.charsjavaee.b_database;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class B3Connection2 extends B3Adapter {

    private Connection conn;
    private List<Connection> pool;

    public B3Connection2(Connection conn, List<Connection> pool) {
        super(conn);
        this.conn = conn;
        this.pool = pool;
    }

    @Override
    public void close() throws SQLException {
        pool.add(conn);
    }
}
