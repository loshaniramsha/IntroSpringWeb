package org.example.introspringweb.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")

public class Demo {
    @GetMapping
    public String othersGET(){
        return "Hello get";
    }
    @GetMapping("other")
    public String OthersGET02(){
        return "Hello get02";
    }
    @PostMapping
    public String Post(){
        return "Hello post";
    }
}
