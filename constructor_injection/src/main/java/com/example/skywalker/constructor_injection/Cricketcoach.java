package com.example.skywalker.constructor_injection;

import org.springframework.stereotype.Component;

@Component
public class Cricketcoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice batting for 20 min...";
    }

    
}
