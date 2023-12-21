/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.luv2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @GetMapping("/processFormV2")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName");
        String result = "Yo! Yo! " + name.toUpperCase();

        model.addAttribute("message", result);

        return "helloworld";
    }

    @PostMapping("/processFormV3")
    public String processFormV3(@RequestParam("studentName") String theName, Model model) {

        String result = "Version 3! Yo! " + theName.toUpperCase();

        model.addAttribute("message", result);

        return "helloworld";
    }
}
