package br.com.dio.gftspringwebrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/")
    public String welcome() {
        return "Welcome to Spring Boot REST API!QUando que isso muda?";
    }
}
