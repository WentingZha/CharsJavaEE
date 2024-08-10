package com.zwt.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zwt.domain.Book;
import com.zwt.service.IBookService;
import com.zwt.utils.Chars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/books")
public class BookController1 {

    @Autowired
    private IBookService bookService;

    //http://localhost/books
    @GetMapping
    public Chars queryAll() {
        return new Chars(true,bookService.list());
    }

    //http://localhost/books
    /*
    {
        "type": "test21",
        "name":"test22",
        "description": "test23"
    }
    */
    @PostMapping
    public Chars insert(@RequestBody Book book) throws IOException {
        //perform an exception
        if(book.getName().equals("1")) throw new IOException();
        boolean flag = bookService.insertBook(book);
        return new Chars(flag,flag?"Added":"Failed");
//        return new Chars(bookService.insertBook(book));
    }

    //http://localhost/books
    /*
        {
            "id":17,
            "type": "test211",
            "name":"test221",
            "description": "test231"
        }
    */
    @PutMapping
    public Chars update(@RequestBody Book book) {
        return new Chars(bookService.modifyBook(book));
    }

    //Delete: http://localhost/books/17
    @DeleteMapping("{id}")
    public Chars delete(@PathVariable Integer id) {
        return new Chars(bookService.deleteBook(id));
    }

    //http://localhost/books/2
    @GetMapping("{id}")
    public Chars queryById(@PathVariable Integer id) {
        return new Chars(true,bookService.getById(id));
    }

//    http://localhost/books/1/5
//    @GetMapping("{currentCarrier}/{size}")
//    public Chars checkPage(@PathVariable int size, @PathVariable int currentCarrier){
//        IPage<Book> bookIPage = bookService.checkPage(currentCarrier, size);
//        //Fix the bug: if only one item display on the last page, the list will be empty when the item is deleted
//        if(currentCarrier > bookIPage.getPages()) {
//            bookIPage = bookService.checkPage((int) bookIPage.getPages(), size);
//        }
//        return new Chars(true,bookIPage);
//    }

    //http://localhost/books/1/5?type=1&description=2?name=3
    @GetMapping("{currentCarrier}/{pageSize}")
    public Chars checkPageConditional(@PathVariable int currentCarrier, @PathVariable int pageSize, Book book){
        IPage<Book> bookIPage;
        if(book == null || book.getType().isEmpty()) {
            bookIPage = bookService.checkPage(currentCarrier, pageSize);
            //Fix the bug: if only one item display on the last page, the list will be empty when the item is deleted
            if(currentCarrier > bookIPage.getPages()) {
                bookIPage = bookService.checkPage((int) bookIPage.getPages(), pageSize);
            }
        } else {
            bookIPage = bookService.checkPageConditional(currentCarrier, pageSize, book);
            //Fix the bug: if only one item display on the last page, the list will be empty when the item is deleted
            if(currentCarrier > bookIPage.getPages()) {
                bookIPage = bookService.checkPageConditional((int) bookIPage.getPages(), pageSize,book);
            }
        }

        return new Chars(true,bookIPage);
    }

}
