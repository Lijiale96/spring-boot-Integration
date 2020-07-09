package com.firenay.spring.bo2ot.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHandler {
    @RequestMapping("/hello")
    public String hello(){
        return "hello£¬Lijiale is handsome£¡";
    }
}
