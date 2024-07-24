package com.zwt.charsjavaee.b_database.b6_mybatis.b6_8_annotation.one_one_cast;

import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean.Card;
import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean.Person;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CardCast {
    @Select("SELECT * FROM card")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "number",property = "number"),
            @Result(
                    property = "p",//the name of included variable
                    javaType = Person.class,
                    column = "pid",//Check the person table with pid from card table
                    /**
                     * One to one relation
                     * select: the method in the interface
                     */
                    one=@One(select = "com.zwt.charsjavaee.b_database.b6_mybatis.b6_8_annotation.one_one_cast.PersonCast.checkById")
            )
    })
    List<Card> checkAll();
}
