package org.example.introspringweb.config.controller;

import org.springframework.http.MediaType;
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

    @PostMapping(params = {"name","age","school"})
    public String HelloMapping5(@RequestParam("name") String Myname, @RequestParam("age") int Mage,@RequestParam("school") String Myschool){
        return "My name is " + Myname + " and my age is " + Mage + " and my school is " + Myschool;

    }
    @PostMapping(headers = "X-city")
    public String HelloMapping6(@RequestHeader ("X-city") String myCustomHeader){

        return "My City is"+" " + myCustomHeader;
    }

    @PostMapping(headers = {"X-city","X-country","Content-Type"})
    public String HelloMapping7(@RequestHeader ("X-city") String myCity,@RequestHeader ("X-country") String myCounty,@RequestHeader ("Content-Type") String myContentType){

        return "My City is"+" " + myCity + " " + "my Country is"+" " + myCounty +" " + "my Content Type is"+" " + myContentType;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String HelloMapping8(){
        return "jason type handle";

    }
}
