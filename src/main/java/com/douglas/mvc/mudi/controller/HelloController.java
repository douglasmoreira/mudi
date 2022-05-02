package com.douglas.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String getHello(Model request) {
        request.addAttribute("nome", "Mundo");
        return "hello";
    }
}
