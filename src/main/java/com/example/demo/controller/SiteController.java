package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {

    @GetMapping("/events")
    public String showEvents() {return "events";}

    @GetMapping("/about")
    public String showAbout() {return "about";}

    @GetMapping("/news")
    public String showNews() {return "news";}

    @GetMapping("/contact")
    public String showContact() {return "contact";}

}
