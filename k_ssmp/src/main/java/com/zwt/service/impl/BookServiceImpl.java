package com.zwt.service.impl;

import com.zwt.cast.BookCast;
import com.zwt.domain.Book;
import com.zwt.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookCast bookCast;

    @Override
    public Boolean save(Book book) {
        return bookCast.insert(book) > 0;
    }

    @Override
    public Boolean update(Book book) {
        return bookCast.updateById(book) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return bookCast.deleteById(id) > 0;
    }

    @Override
    public Book CheckById(Integer id) {
        return bookCast.selectById(id);
    }

    @Override
    public List<Book> queryAll() {
        return bookCast.selectList(null);
    }
}
