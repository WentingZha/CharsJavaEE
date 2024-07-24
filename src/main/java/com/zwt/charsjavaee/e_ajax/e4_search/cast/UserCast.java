package com.zwt.charsjavaee.e_ajax.e4_search.cast;

import com.zwt.charsjavaee.e_ajax.e4_search.chars.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserCast {
    //Concat the search condition
    @Select("SELECT * FROM USER WHERE NAME LIKE CONCAT('%',#{username},'%') ORDER BY SEARCH_COUNT DESC LIMIT 0,4")
    List<User> searchLike(String username);
}
