package org.example.introspringweb.config.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/map")

public class Mapping {

    @GetMapping("hello?")
    public String HelloMapping(){
        return "hello mapping";

    }

    @GetMapping("hello02/*")
    public String HelloMapping02(){
        return "hello mapping 02";

    }


    @GetMapping("hello03/**")
    public String HelloMapping03(){
        return "hello mapping 03";

    }

    @PostMapping("/{name}")
    public String HelloPost(@PathVariable ("name") String name){
        return "hello post " + name;

    }

    @PostMapping("/{name}/{value}")
    public String HelloPost02(@PathVariable ("name") String name,@PathVariable ("value") int value){
        return "hello post " + name +" " + "and" + " "  + value;

    }

    @PostMapping("{id:S\\d{4}}")
    public String HelloPost03(@PathVariable ("id") String id){
        return "hello post " + id;

    }

    @PostMapping(params = {"name","age"})
    public String HelloMapping5(@RequestParam("name") String Myname, @RequestParam("age") int Mage){
        return "My name is " + Myname + " and my age is " + Mage;

    }
}
