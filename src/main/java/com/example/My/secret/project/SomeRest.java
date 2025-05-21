package com.example.My.secret.project;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeRest {

    @GetMapping
    public String message() {
        return "Hello World";
    }

}
