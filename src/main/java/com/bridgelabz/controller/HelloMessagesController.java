package com.bridgelabz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMessagesController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello From BridgeLabz ";
    }

    @GetMapping("/query")
    public String sayHello2(@RequestParam String name){
        return "Hello "+name;
    }

    @GetMapping("/param/{name}")
    public String sayHello3(@PathVariable String name){
        return "Hello "+name;
    }
}
