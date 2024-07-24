package com.zwt.charsjavaee.b_database.b6_mybatis.b6_8_annotation.one_multi_cast;

import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean.Person;
import org.apache.ibatis.annotations.Select;

public interface PupilCast {
    @Select("SELECT * FROM pupil WHERE pupilId=#{pupilId}")
    Person checkById(Integer pupilId);
}
