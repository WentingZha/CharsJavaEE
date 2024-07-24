package com.zwt.charsjavaee.b_database.b6_mybatis.b6_8_annotation.one_one_cast;

import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean.Person;
import org.apache.ibatis.annotations.Select;

public interface PersonCast {
    @Select("SELECT * FROM person WHERE id=#{id}")
    Person checkById(Integer id);
}
