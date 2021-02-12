package de.patrickmetz.hello_world_service;

import de.patrickmetz.hello_world_service.view.HelloWorldViewIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    HelloWorldViewIF<String> viewString;

    @GetMapping(path = "/hello")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return viewString.greeting(name);
    }

}
