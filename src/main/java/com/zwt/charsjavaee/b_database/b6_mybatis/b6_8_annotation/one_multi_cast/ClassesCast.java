package com.zwt.charsjavaee.b_database.b6_mybatis.b6_8_annotation.one_multi_cast;

import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean.Classes;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ClassesCast {
    @Select("SELECT * FROM classes")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(
                    property = "pupils",
                    javaType = List.class,
                    column = "pupilId",//Check student table with id of the classes table
                    many = @Many(select = "com.zwt.charsjavaee.b_database.b6_mybatis.b6_8_annotation.one_multi_cast.PupilCast.checkById")
            )
    })
    List<Classes> checkAll();
}
