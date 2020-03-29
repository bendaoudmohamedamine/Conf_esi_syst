package com.esi.conf_esi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/confs")
public class ConfController {

    @GetMapping("/ajouter")
    public String addConf (){
        return "ajouter";
    }
    @GetMapping("/list")
    public String listConf(){
        return "list";
    }

}
