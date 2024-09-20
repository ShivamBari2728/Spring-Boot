package com.example.skywalker.setter_injection;

import org.springframework.stereotype.Component;

@Component
public class cricketCoach implements coach {

    @Override
    public String getDailyWorkout() {
        return "Practice batting for 21 min...";
    }

}
