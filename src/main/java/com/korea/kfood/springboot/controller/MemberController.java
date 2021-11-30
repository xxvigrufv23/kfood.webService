package com.korea.kfood.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/login")
    public String login() {
        return "forward:/index.html";
    }

    @GetMapping("/signup")
    public String signUp() {
        return "forward:/index.html";
    }

    @GetMapping("/identify")
    public String identify() {
        return "forward:/index.html";
    }

    @GetMapping("/register")
    public String register() {
        return "forward:/index.html";
    }
}
