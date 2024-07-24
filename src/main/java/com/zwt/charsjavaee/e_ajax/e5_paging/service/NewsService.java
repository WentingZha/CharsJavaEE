package com.zwt.charsjavaee.e_ajax.e5_paging.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.zwt.charsjavaee.e_ajax.e5_paging.chars.News;

import java.util.List;

public interface NewsService {
   PageInfo<List<News>> pagingQuery(Integer start, Integer pageSize);
}
