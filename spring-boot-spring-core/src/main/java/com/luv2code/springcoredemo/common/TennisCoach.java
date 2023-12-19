/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    public TennisCoach() {
        System.out.println("In constructor: " + this.getClass());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
