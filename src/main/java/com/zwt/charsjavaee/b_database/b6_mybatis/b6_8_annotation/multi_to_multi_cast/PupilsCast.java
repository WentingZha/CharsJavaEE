package com.zwt.charsjavaee.b_database.b6_mybatis.b6_8_annotation.multi_to_multi_cast;

import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean.Pupil;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PupilsCast {
    @Select("SELECT * FROM pupil")
    @Results({
            @Result(column = "pupilId", property = "pupilId"),
            @Result(column = "name", property = "name"),
            @Result(column = "age", property = "age"),
            @Result(
                    property = "courses",
                    javaType = List.class,
                    column = "pupilId",
                    many = @Many(select = "com.zwt.charsjavaee.b_database.b6_mybatis.b6_8_annotation.multi_to_multi_cast.CourseCast.checkById")
            )
    })
    List<Pupil> checkAll();
}
