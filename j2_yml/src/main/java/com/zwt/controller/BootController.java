package com.zwt.controller;

import com.zwt.ZhaDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/yml")
public class BootController {

    //Read data in yml
    @Value("${country}")
    private String country;

    @Value("${user.username}")
    private String name1;

    @Value("${hobby[0]}")
    private String hobby0;

    @Value("${users1[0].username}")
    private String user1Name;

    @Value("${server.port}")
    private String serverPort;

    @Value("${tempDir}")
    private String tempDir;

    @Value("${tempDir1}")
    private String tempDir1;

    //Autowired: Encapsulate all the yml data to the Environment object
    @Autowired
    private Environment environment;

    @Autowired
    private ZhaDataSource zhaDataSource;

    @GetMapping
    public String runSpringBoot(){
        System.out.println("yml 1 is running...");
        System.out.println("Country is " + country);
        System.out.println("Name is " + name1);
        System.out.println("hobby0 is " + hobby0);
        System.out.println("user1Name is " + user1Name);
        System.out.println("serverPort is " + serverPort);
        System.out.println("tempDir is " + tempDir);
        System.out.println("tempDir1 is " + tempDir1);

        System.out.println("environment-port is " + environment.getProperty("server.port"));
        System.out.println("environment-user11name is " + environment.getProperty("users1[1].name"));

        System.out.println("datasource is " + zhaDataSource);
        return "yml 1 is running...";
    }
}
