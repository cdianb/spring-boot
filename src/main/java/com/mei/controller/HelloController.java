package com.mei.controller;

import com.mei.beans.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    Car car;
    @RequestMapping("/car")
    public Car car(){
        return car;
    }
    @GetMapping("/springBoot")
    @ResponseBody
    public String hello(){

        return "hello,spring-boot " + "你好！";
    }
}
