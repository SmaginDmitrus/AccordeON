package com.github.smagindmitrus.AccordeON.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/status")
    public String status() {
        return "Accordeon API is running!";
    }
}