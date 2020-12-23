package com.air.quality.scanner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FirstController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name","Ashish");
        return "index";

    }
}
