package com.zwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boot1")
public class BootController {

    @GetMapping
    public String runSpringBoot(){
        System.out.println("Spring initializr 1 is running...");
        return "Spring initializr 1 is running...";
    }
}
