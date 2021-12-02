package com.bridgelabz.controller;

import com.bridgelabz.controller.Dto.UserDto;
import org.springframework.web.bind.annotation.*;

/**
 * Purpose: This class is to make different HTTP request method calls using Rest controller.
 *
 * @author Ashwith
 * @since 1/12/21
 */
@RestController
public class HelloMessagesController {

    /**
     * Purpose : This method is used to get Greeting hello message from Bridgelabz
     *
     * @return hello message from Bridgelabz
     */
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello From Bridgelabz ";
    }

    /**
     * Purpose : This method is used to get greeting hello message using RequestParameter
     *
     * @param name the name that is to be displayed
     * @return greeting hello message invoking name
     */
    @GetMapping("/query")
    public String sayHello2(@RequestParam String name) {
        return "Hello " + name;
    }

    /**
     * Purpose : This method is used to get greeting hello message using PathVariable
     *
     * @param name the name that is to be displayed
     * @return greeting hello message invoking name
     */
    @GetMapping("/param/{name}")
    public String sayHello3(@PathVariable String name) {
        return "Hello " + name;
    }

    /**
     * Purpose : This method is used to post user details stored in DTO
     *
     * @param userDto defines the details of user
     * @return details of the user
     */
    @PostMapping("/hello/post")
    public UserDto sayHello4(@RequestBody UserDto userDto) {
        return userDto;
    }

    /**
     * Purpose : This method is used to put request of invoking both PathVariable and RequestParam
     *
     * @param firstname the firstname that is to be displayed
     * @param lastname  the lastname that is to be displayed
     * @return greeting hello message invoking both firstname and lastname.
     */
    @PutMapping("/put/{firstname}")
    public String sayHello5(@PathVariable String firstname, @RequestParam String lastname) {
        return "Hello " + firstname + " " + lastname;
    }
}
