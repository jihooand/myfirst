package com.choong.myfirst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {

    @GetMapping("")
    public String hello() {
        return "hellotest";
    }

    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("testStr", "Hello World!!");
        model.addAttribute("name", "박준호");
        return "index";
    }

    @GetMapping("index/hello")
    public String indexHello() {
        return "indexHello";
    }
}
