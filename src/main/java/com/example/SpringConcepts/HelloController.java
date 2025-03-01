package com.example.SpringConcepts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

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


@RestController
@RequestMapping("/hello")
class HelloControllerFirstLastName {

    // POST API: localhost:8080/hello/post
    @PostMapping("/post")
    public String sayHello(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }
}

@RestController
@RequestMapping("/hello")
class HelloControllerFirstLastLocalHost {

    @PutMapping("/put/{firstName}")
    public String updateGreeting(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}