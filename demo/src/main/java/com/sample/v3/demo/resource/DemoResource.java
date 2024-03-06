package com.sample.v3.demo.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")

public class DemoResource {
    Logger logger= LoggerFactory.getLogger(DemoResource.class);
    @GetMapping("hello")
    public String hello(){
        logger.info("Hello World");
        return "Hello World";
    }
}
