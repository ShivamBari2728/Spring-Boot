package com.skywalker.springboot.demo.myspringapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello world";
    }
    @GetMapping("/workout")
    public String startworkout()
    {
        return "workout stopped by me ";
    }

    

}
