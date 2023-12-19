/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In constructor: " + this.getClass());
    }

//    @PostConstruct
//    public void doMyStartupStuff() {
//        System.out.println("In doMyStartupStuff(): " + this);
//    }
//
//    @PreDestroy
//    public void doMyCleanupStuff() {
//        System.out.println("In doMyCleanupStuff(): " + this);
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!!";
    }
}
