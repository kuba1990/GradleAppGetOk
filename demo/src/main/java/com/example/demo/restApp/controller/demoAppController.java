package com.example.demo.restApp.controller;

//http://localhost:8080/hi/bisnode

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoAppController {

@RequestMapping ("/hi/{name}")
    public String talkWithMe(@PathVariable String name){

    return "Hi " + name + " Bisnode";
    }

}
