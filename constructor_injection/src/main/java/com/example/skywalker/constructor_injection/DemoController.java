package com.example.skywalker.constructor_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
    private Coach mycoach;


    @Autowired
    public DemoController(Coach thecoach){
        mycoach = thecoach;
    }

    @GetMapping("/dailyworkout")
    public String getdailyworkout() {
        return mycoach.getDailyWorkout();
    }
    
}
