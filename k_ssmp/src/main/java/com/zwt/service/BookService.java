package com.zwt.service;

import com.zwt.domain.Book;

import java.util.List;

public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book CheckById(Integer id);
    List<Book> queryAll();
}
