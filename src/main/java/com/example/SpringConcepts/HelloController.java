package com.example.SpringConcepts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}


@RestController
@RequestMapping("/hello")
class mark {
    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}

@RestController
@RequestMapping("/hello")
class Mark1 {
    @GetMapping("/param/{name}")
    String sayHello(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}