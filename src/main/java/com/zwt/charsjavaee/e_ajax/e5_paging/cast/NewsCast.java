package com.zwt.charsjavaee.e_ajax.e5_paging.cast;

import com.zwt.charsjavaee.e_ajax.e5_paging.chars.News;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface NewsCast {

    @Select("SELECT * FROM news")
    List<News> checkAll();
}
