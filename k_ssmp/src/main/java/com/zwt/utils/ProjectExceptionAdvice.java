package com.zwt.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//Exception handler for springmvc
//@ControllerAdvice
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //Intercept all the exception
    @ExceptionHandler(Exception.class)
    public Chars handleException(Exception e) {
        e.printStackTrace();
        return new Chars("Server error");

    }
}
