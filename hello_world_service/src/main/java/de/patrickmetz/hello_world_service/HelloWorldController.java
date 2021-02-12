package de.patrickmetz.hello_world_service;

import de.patrickmetz.hello_world_service.view.HelloWorldView;
import de.patrickmetz.hello_world_service.view.HelloWorldViewIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PreDestroy;

@RestController
public class HelloWorldController {

    @Autowired
    HelloWorldViewIF<String> viewString;

    @Autowired
    private ApplicationContext appContext;

    @GetMapping(path = "/hello")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return viewString.greeting(name);
    }

    @GetMapping(path = "/shutdown")
    public void shutdown()  {
        SpringApplication.exit(appContext, () -> 0);
    }
}
