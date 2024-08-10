package com.zwt.cast;

import com.zwt.chars.BookStore;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookStoreCast {
    @Select("SELECT * FROM BOOKSTORE WHERE id = #{id}")
    BookStore checkById(Integer id);
}
