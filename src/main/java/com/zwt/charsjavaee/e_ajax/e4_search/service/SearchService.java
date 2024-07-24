package com.zwt.charsjavaee.e_ajax.e4_search.service;

import com.zwt.charsjavaee.e_ajax.e4_search.chars.User;

import java.util.List;

public interface SearchService {
    List<User> searchLike(String userName);
}
