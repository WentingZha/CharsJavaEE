package com.zwt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zwt.domain.Book;


public interface IBookService extends IService<Book> {
    boolean insertBook(Book book);
    boolean modifyBook(Book book);
    boolean deleteBook(Integer id);
    IPage<Book> checkPage(int currentCarrier, int pageSize);
    IPage<Book> checkPageConditional(int currentCarrier, int pageSize,Book book);
}
