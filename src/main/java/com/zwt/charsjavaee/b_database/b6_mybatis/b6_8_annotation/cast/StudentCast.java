package com.zwt.charsjavaee.b_database.b6_mybatis.b6_8_annotation.cast;

import com.zwt.charsjavaee.Student1;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentCast {
    @Select("SELECT * FROM STUDENT1")
    List<Student1> checkAll();

    @Insert("INSERT INTO STUDENT1 VALUES (#{sid},#{name},#{age},#{score})")
    Integer insert(Student1 student);

    @Update("UPDATE STUDENT1 SET name=#{name},age=#{age},score=#{score} WHERE sid=#{sid}")
    Integer edit(Student1 student);

    @Delete("DELETE FROM STUDENT1 WHERE sid=#{sid}")
    Integer remove(String id);
}