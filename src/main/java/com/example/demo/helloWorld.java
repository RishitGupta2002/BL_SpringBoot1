package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloworld")
public class helloWorld {

    @GetMapping
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz & Rishit");
        return "hello";
    }
}