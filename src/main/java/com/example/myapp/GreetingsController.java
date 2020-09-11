package com.example.myapp;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(allowedHeaders = "*",origins = "*")
public class GreetingsController {

    @GetMapping("/")
    public String greeting()
    {
        return "HelloWorld Rif!!";
    }

}
