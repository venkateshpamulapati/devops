package com.sample.v3.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoResource {
    @GetMapping("hello")
    public String hello(){
        return "Hello World";
    }
}
