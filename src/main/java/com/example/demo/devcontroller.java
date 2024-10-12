package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class devcontroller {

    @GetMapping("/dev")
    public String getDev() {
        return "Здарова Дядя!";
    }
}