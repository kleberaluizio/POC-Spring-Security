package com.security.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/public")
    public String publicMethod() {
        return "<h1>Public route, feel free to explore!</h1>";
    }

    @GetMapping("/private")
    public String privateMethod() {
        return "<h1>Private route, limited access!</h1>";
    }
}
