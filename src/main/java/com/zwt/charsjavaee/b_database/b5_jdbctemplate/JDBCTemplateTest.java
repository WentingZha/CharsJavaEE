package com.zwt.charsjavaee.b_database.b5_jdbctemplate;


import com.zwt.charsjavaee.b_database.b5_jdbctemplate.domain.Student;
import com.zwt.charsjavaee.b_database.b5_jdbctemplate.handler.BeanHandler;
import com.zwt.charsjavaee.b_database.b5_jdbctemplate.handler.BeanListHandler;
import com.zwt.charsjavaee.b_database.b5_jdbctemplate.handler.ScalarHandler;
import org.junit.Test;

import java.util.List;

public class JDBCTemplateTest {

    private JDBCTemplate template = new JDBCTemplate(DataSourceUtils.getDataSource());

    @Test
    public void queryForScalar() {

        String sql = "SELECT COUNT(*) FROM student";
        Long value = template.queryForScalar(sql,new ScalarHandler<Long>());
        System.out.println(value);
    }

    @Test
    public void queryForList() {

        String sql = "SELECT * FROM student";
        List<Student> list = template.queryForList(sql, new BeanListHandler<>(Student.class));
        for(Student stu : list) {
            System.out.println(stu);
        }
    }

    @Test
    public void queryForObject() {

        String sql = "SELECT * FROM student WHERE name=?";
        Student stu = template.queryForObject(sql,new BeanHandler<>(Student.class),1);
        System.out.println(stu);
    }

    @Test
    public void delete() {

        String sql = "DELETE FROM student WHERE name=?";
        int result = template.update(sql, "CMT");
        System.out.println(result);
    }

    @Test
    public void update() {

        String sql = "UPDATE student SET age=? WHERE name=?";
        Object[] params = {"35","CMT"};
        int result = template.update(sql, params);
        System.out.println(result);
    }

    @Test
    public void insert() {

        String sql = "INSERT INTO student VALUES (?,?,?)";
        Object[] params = {"CMT","35","100"};
        int result = template.update(sql, params);
        if(result != 0) {
            System.out.println("Inserted");
        }else {
            System.out.println("Failed");
        }
    }
}
