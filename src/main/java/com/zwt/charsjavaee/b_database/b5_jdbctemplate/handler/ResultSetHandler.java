package com.zwt.charsjavaee.b_database.b5_jdbctemplate.handler;

import java.sql.ResultSet;

public interface ResultSetHandler<T> {
    <T> T handler(ResultSet rs);
}
