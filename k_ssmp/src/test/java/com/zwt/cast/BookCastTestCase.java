package com.zwt.cast;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zwt.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookCastTestCase {
    @Autowired
    private BookCast bookCast;

    @Test
    void testCheckById(){
        bookCast.selectById(1);
    }

    @Test
    void testInsert(){
        Book book = new Book();
        book.setType("test1");
        book.setName("test1");
        book.setDescription("test1");
        bookCast.insert(book);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(16);
        book.setType("test123");
        book.setName("test1");
        book.setDescription("test1");
        bookCast.updateById(book);
    }

    @Test
    void testDelete(){
        bookCast.deleteById(15);
    }

    @Test
    void testQueryAll(){
        bookCast.selectList(null);
    }

    /*
        1.Add interceptor configuration
        2.Create a page instance
        3.Execute select page
     */
    @Test
    void testPager(){
        IPage page = new Page(1, 5);
        bookCast.selectPage(page,null);
        System.out.println(page.getCurrent());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getSize());
        page.getRecords().forEach(System.out::println);
    }

    @Test
    void testConditionalCheck(){
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("description","Java");
        bookCast.selectList(queryWrapper);
    }

    @Test
    void testLamdaConditionalCheck(){
        String name = "Java";
        LambdaQueryWrapper<Book> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(name != null,Book::getDescription, name);
        bookCast.selectList(queryWrapper);
    }
}
