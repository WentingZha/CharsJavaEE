package com.zwt.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceTestCase {

//    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private IBookService bookService;

    @Test
    void testCheckById(){
        System.out.println(bookService.deleteBook(16));
    }

//    @Test
//    void testQueryAll(){
//        System.out.println(bookService.());
//    }
}
