package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page handler.!");
        model.addAttribute("name", "Wander Wise Traveller");
        model.addAttribute("bike", "Apache RTR 180");
        model.addAttribute("github", "https://github.com/wanderwisecoder");
        return "home";
    }
}
