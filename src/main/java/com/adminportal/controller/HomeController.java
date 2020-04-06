package com.adminportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// @RequestMapping("/adminportal")
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }
}