package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {

    @GetMapping("/calendar")
    public String showEvents() {return "calendar";}

    @GetMapping("/about")
    public String showAbout() {return "about";}

    @GetMapping("/education")
    public String showNews() {return "education";}

    @GetMapping("/resources")
    public String showContact() {return "employeeresources";}

}
