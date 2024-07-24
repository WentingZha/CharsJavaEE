package com.zwt.charsjavaee.b_database.b6_mybatis.b6_9_sql_method;

import com.zwt.charsjavaee.Student1;
import org.apache.ibatis.jdbc.SQL;

public class ReturnSql {
    public static void main(String[] args) {
        System.out.println(getCheckAll());
        System.out.println(getInsert());
    }

    public static String getCheckAll(){
        String sql = new SQL() {
            {
                SELECT("*");
                FROM("Student1");
            }
        }.toString();
        return sql;
    }

   public static String getInsert(){
        return new SQL(){
            {
                INSERT_INTO("Student1");
                INTO_VALUES("#{sid},#{name},#{age},#{score}");
            }
        }.toString();
   }

   public String getEdit(Student1 stu) {
        return new SQL() {
            {
                UPDATE("student1");
                SET("name=#{name}","age=#{age}","score=#{score}");
                WHERE("sid=#{sid}");
            }
        }.toString();
   }

    public String getRemove(String id) {
        return new SQL() {
            {
                DELETE_FROM("student1");
                WHERE("sid=#{sid}");
            }
        }.toString();
    }
}
