package com.zwt.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zwt.domain.Book;
import com.zwt.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService bookService;

    //http://localhost/books
    @GetMapping
    public List<Book> queryAll() {
        return bookService.list();
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
    public Boolean insert(@RequestBody Book book) {
        return bookService.save(book);
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
    public Boolean update(@RequestBody Book book) {
        return bookService.modifyBook(book);
    }

    //Delete: http://localhost/books/17
    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id) {
        return bookService.deleteBook(id);
    }

    //http://localhost/books/2
    @GetMapping("{id}")
    public Book queryById(@PathVariable Integer id) {
        return bookService.getById(id);
    }

    //http://localhost/books/1/5
    @GetMapping("{currentCarrier}/{size}")
    public IPage<Book> checkPage(@PathVariable int size, @PathVariable int currentCarrier){
        return bookService.checkPage(currentCarrier,size);
    }

}
