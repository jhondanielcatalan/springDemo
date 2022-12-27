package com.sevensevengsi.Spring.Security.Activity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping({"/home","/"})
    public String home() {
        return "home";
    }



    @GetMapping("/accessDenied")
    public String forAccessDenied(){
        return "accessDenied";
    }
}
