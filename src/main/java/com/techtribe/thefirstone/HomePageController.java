package com.techtribe.thefirstone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/home")
public class HomePageController {

    @GetMapping
    public String getHomePage(){
        return "HELLO Techy Code Tribe. Full and Final API.";
    }

}
