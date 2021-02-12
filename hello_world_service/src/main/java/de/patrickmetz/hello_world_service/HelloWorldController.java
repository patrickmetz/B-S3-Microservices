package de.patrickmetz.hello_world_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello, " + name;
    }

}
