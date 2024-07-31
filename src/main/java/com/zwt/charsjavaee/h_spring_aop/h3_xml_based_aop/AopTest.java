package com.zwt.charsjavaee.h_spring_aop.h3_xml_based_aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:appContext_h3.xml")
public class AopTest {
    @Autowired
    private TargetInterface target;

    @Test
    public void test1(){
        target.buildCabin();
    }

}
