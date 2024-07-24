package com.zwt.charsjavaee.b_database.b6_mybatis.b6_4_dynamic_sql.cast;

import com.zwt.charsjavaee.Student;
import com.zwt.charsjavaee.Student1;

import java.util.List;

//All the method name should be the same as StudentMapper.xml
public interface StudentCast {
    Integer insert(Student1 student1);
    Integer update(Student1 student1);
    Integer delete(String sid);
    //Multi-condition-inquiry
    List<Student1> checkWithMultiCondition(Student1 student1);

    List<Student1> checkByIds(List<String> ids);
}
