package com.zwt.cast;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zwt.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookCast extends BaseMapper<Book> {

}
