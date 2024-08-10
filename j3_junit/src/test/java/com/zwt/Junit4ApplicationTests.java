package com.zwt;

import com.zwt.cast.CharsCast;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//classes should be declared when ig test class is moved to another folder
//@SpringBootTest(classes = Junit4Application.class)
@SpringBootTest()
class Junit4ApplicationTests {
    //Inject the test object
    @Autowired
    private CharsCast charsCast;


    @Test
    void contextLoads() {
        System.out.println("test");
        //test the function of injected object
        charsCast.initAChar();
    }

}
