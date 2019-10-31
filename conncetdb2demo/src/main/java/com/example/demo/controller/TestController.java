package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Auther:cherry
 * CreateTime:2019-10-12 10:25
 */
//@Controller
//@RequestMapping("/user")
    @RestController
public class TestController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }



}
