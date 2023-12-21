/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.luv2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("theDate", new Date());
        return "helloworld";
    }

}
