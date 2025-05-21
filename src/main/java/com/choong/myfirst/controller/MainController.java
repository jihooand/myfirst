package com.choong.myfirst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/main")
    public String index() {
        return "index";
    }

    @GetMapping("/main/menu")
    public String menu(Model model) {
        model.addAttribute("left_model","menu/menu_left");
        model.addAttribute("right_model","menu/menu_right");
        return "index";
    }

    @GetMapping("/main/menu2")
    public String menu2(Model model) {
        model.addAttribute("left_model","testmenu/testmenu_left");

        return "index";
    }
}
