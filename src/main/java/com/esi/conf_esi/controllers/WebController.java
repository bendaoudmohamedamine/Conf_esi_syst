package com.esi.conf_esi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebController {
    @GetMapping("/")
    public String home(){
        return "index.html";
    }
    @GetMapping("/confs")
    public String conf(){

        return "confs";
    }
}

