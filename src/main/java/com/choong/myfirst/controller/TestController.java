package com.choong.myfirst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class TestController {

    //localhost:8090/test
    @GetMapping("/test")
    public String test(){
        return "Hello, World!";
    }
}
