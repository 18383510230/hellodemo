package com.example.helloweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebController {

    @GetMapping("/helloweb")
    public String hello() {
        return "helloweb............." + System.currentTimeMillis();
    }

}
