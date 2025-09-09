package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AppController {
    @GetMapping("/")
    public String home(){
        return "Welcome to spring app deployed";
    }
    @GetMapping("/about")
    public String about() {
        return new String("Welcome to about page of the app");
    }
    

}
