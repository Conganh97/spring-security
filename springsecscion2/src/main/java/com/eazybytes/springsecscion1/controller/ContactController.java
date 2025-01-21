package com.eazybytes.springsecscion1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/welcome")
    public String sayHello() {
        return "Here are the balance details form the DB";
    }
}
