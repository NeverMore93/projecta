package com.ywt.projecta.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/projectA")
    String home() {
       return  "Hello World A!";
    }
}
