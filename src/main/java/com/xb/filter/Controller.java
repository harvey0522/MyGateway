package com.xb.filter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/myfallback")
    public String get(){
        return "fail";
    }
}
