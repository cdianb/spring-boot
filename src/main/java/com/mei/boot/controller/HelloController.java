package com.mei.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/ugly.jpg")
    public String hello(){
        return "aaa";
    }

}
