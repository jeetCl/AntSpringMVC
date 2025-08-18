package com.mkyong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Spring MVC Controller for handling hello world requests
 * @author mkyong
 */
@Controller
public class HelloController {
    
    /**
     * Handle GET request for hello page
     * @param model Spring MVC model
     * @return view name
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }
    
    /**
     * Handle GET request for home page
     * @param model Spring MVC model
     * @return view name
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("title", "Spring MVC Demo");
        model.addAttribute("message", "Welcome to Spring MVC with Ant build system!");
        return "home";
    }
    
    /**
     * Get welcome message
     * @return welcome message string
     */
    public String getWelcomeMessage() {
        return "Welcome to Spring MVC Framework!";
    }
}
