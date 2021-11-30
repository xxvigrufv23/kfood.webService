package com.korea.kfood.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {

    @GetMapping("/shopping")
    public String shopping() {
        return "forward:/index.html";
    }
}
