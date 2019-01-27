package com.luv2.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Khuram Shah on 1/27/2019.
 */
@Controller
public class DemoController {
    @GetMapping("/leaders")
    public String showLeaders(){
        return "leaders";
    }

    @GetMapping("/systems")
    public String showSystems(){
        return "systems";
    }
}
