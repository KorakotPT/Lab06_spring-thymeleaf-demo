package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "สวัสดี นายกรกฏ พรมทอง");
        model.addAttribute("studentId", "673380025-8");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("info", "สวัสดี ผมชื่อ นายกรกฏ พรมทอง รหัสนักศึกษา 673380025-8 ชื่อเล่น บิ๊ก อายุ 20 เกิด 26 กันยายน 2569 กำลังศึกษาวิชา CP353002 Principles of Software Design");
        return "about";
    }
}