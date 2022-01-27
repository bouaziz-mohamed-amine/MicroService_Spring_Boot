package com.example.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(path ="s1/")
public class MicroS1Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroS1Application.class, args);
    }

    @GetMapping
    public String getElements(){
        return "amine";
    }

}
