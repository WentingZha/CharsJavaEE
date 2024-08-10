package com.zwt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zwt.cast.BookCast;
import com.zwt.domain.Book;
import com.zwt.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IBookServiceImpl extends ServiceImpl<BookCast, Book> implements IBookService {
    @Autowired
    private BookCast bookCast;

    @Override
    public boolean insertBook(Book book) {
        return bookCast.insert(book)>0;
    }

    @Override
    public boolean modifyBook(Book book) {
        return bookCast.updateById(book)>0;
    }

    @Override
    public boolean deleteBook(Integer id) {
        return bookCast.deleteById(id)>0;
    }

    @Override
    public IPage<Book> checkPage(int currentCarrier, int pageSize) {
        IPage<Book> page = new Page<>(currentCarrier, pageSize);
        bookCast.selectPage(page,null);
        return page;
    }

    @Override
    public IPage<Book> checkPageConditional(int currentCarrier, int pageSize, Book book) {
        LambdaQueryWrapper<Book> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(!book.getName().isEmpty(),Book::getName, book.getName());
        wrapper.like(!book.getDescription().isEmpty(),Book::getDescription, book.getDescription());
        wrapper.like(!book.getType().isEmpty(),Book::getType, book.getType());
        IPage<Book> page = new Page<>(currentCarrier, pageSize);
        bookCast.selectPage(page,wrapper);
        return page;
    }
}
