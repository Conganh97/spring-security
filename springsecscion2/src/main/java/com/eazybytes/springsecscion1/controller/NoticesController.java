package com.eazybytes.springsecscion1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("/welcome")
    public String sayHello() {
        return "alo alo 123";
    }
}
