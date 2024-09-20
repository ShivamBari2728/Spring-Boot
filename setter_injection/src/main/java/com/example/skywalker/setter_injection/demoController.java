package com.example.skywalker.setter_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
    private coach mycoach;

    @Autowired
    public void objsetter(coach thecoach){
        mycoach = thecoach;
    }

    @GetMapping("/dailyworkout")
    public String getdailyworkout() {
        return mycoach.getDailyWorkout();
    }


}
