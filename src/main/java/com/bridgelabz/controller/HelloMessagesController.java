package com.bridgelabz.controller;

import com.bridgelabz.controller.Dto.UserDto;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/hello/post")
    public String sayHello4(@RequestBody UserDto userDto){
        return userDto.toString();
    }
}
