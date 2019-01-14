package com.george.dev.neochild.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by George on 14/01/2019
 */

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping()
    public String homePage(){
        return "index";
    }
}
