package com.shalaginov.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Controller {
    @GetMapping("get")
    String performGet() {
        return "Hello, world!";
    }
}