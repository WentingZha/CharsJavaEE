package com.zwt.charsjavaee.b_database.b6_mybatis.b6_9_sql_method.cast;

import com.zwt.charsjavaee.Student1;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_9_sql_method.ReturnSql;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface StudentCast {
    @SelectProvider(type = ReturnSql.class,method = "getCheckAll")
    List<Student1> checkAll();

    @InsertProvider(type = ReturnSql.class,method = "getInsert")
    Integer insert(Student1 student);

    @UpdateProvider(type = ReturnSql.class,method = "getEdit")
    void edit(Student1 student);

    @DeleteProvider(type = ReturnSql.class,method = "getRemove")
    void remove(String sid);
}