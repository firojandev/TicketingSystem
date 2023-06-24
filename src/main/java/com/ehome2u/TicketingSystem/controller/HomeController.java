package com.ehome2u.TicketingSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){

        return "home/home";
    }

    @GetMapping("/leaders")
    public String leaders() {

        return "leaders";
    }

    // add request mapping for /systems

    @GetMapping("/systems")
    public String systems() {

        return "systems";
    }
}
