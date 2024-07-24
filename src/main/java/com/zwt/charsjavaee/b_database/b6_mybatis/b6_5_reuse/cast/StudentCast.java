package com.zwt.charsjavaee.b_database.b6_mybatis.b6_5_reuse.cast;

import com.zwt.charsjavaee.Student1;

import java.util.List;

//All the method name should be the same as StudentMapper.xml
public interface StudentCast {
    List<Student1> checkAll();
}
