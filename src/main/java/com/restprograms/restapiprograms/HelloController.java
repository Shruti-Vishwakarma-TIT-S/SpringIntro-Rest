package com.restprograms.restapiprograms;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    @GetMapping("/hello/query")
    public String sayHelloQuery(@RequestParam(name = "name", defaultValue = "World") String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @GetMapping("/hello/param/{name}")
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
