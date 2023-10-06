package edu.miu.cs.cs489.webapps.elibrary.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping
    public String displayHomePage() {
        return "home/index";
    }
}
