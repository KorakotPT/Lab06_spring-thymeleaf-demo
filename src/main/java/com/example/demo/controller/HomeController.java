package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello from Thymeleaf with a custom ViewResolver!");
        return "home"; // คืนค่าเป็นชื่อ view เชิงตรรกะ
    }
}