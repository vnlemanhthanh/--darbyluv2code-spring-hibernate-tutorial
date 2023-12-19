/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    public TrackCoach() {
        System.out.println("In constructor: " + this.getClass());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hark 5k!";
    }
}
