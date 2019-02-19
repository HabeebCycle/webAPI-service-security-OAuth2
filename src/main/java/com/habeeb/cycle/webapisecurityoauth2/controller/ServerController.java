package com.habeeb.cycle.webapisecurityoauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server/api")
public class ServerController {

    @GetMapping
    public String hello(){
        return "Welcome to our server";
    }
}
