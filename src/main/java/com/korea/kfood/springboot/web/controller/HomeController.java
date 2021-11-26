package com.korea.kfood.springboot.web.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

    @GetMapping("/api/home")
    public String home() {
        return "forward:/resources/static/index.html";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
