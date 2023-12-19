/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.luv2code.springcoredemo.common;

public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println("In constructor: " + getClass());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}
