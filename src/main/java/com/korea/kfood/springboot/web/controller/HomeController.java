package com.korea.kfood.springboot.web.controller;

import com.korea.kfood.springboot.web.dto.HelloResponseDTO;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model, HttpServletRequest request) {
        return "forward:/resources/static/index.html";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDTO helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDTO(name, amount);
    }
}
