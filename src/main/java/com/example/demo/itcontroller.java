package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class itcontroller {

    @GetMapping("/it")
    public String getIt() {
        return "Илья Привет!";
    }
}