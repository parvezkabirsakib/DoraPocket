package com.doraPocket.doraPocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String showDashboard() {
        return "dashboard"; // This will look for dashboard.html in src/main/resources/templates
    }
}
