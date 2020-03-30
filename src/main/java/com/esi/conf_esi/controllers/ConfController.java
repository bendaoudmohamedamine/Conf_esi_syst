package com.esi.conf_esi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ConfController {
    @GetMapping("/")
    public String index (){
        return "index";
    }



}
