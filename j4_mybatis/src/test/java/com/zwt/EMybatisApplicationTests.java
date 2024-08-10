package com.zwt;

import com.zwt.cast.BookStoreCast;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EMybatisApplicationTests {

    @Autowired
    private BookStoreCast bookStoreDao;

    @Test
    public void contextLoads() {
        System.out.println(bookStoreDao.checkById(1));
//        System.out.println(bookDao.checkAll());
    }

}
