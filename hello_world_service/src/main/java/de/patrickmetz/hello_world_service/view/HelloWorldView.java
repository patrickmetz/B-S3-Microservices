package de.patrickmetz.hello_world_service.view;

import de.patrickmetz.hello_world_service.service.HelloWorldServiceIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldView implements HelloWorldViewIF<String> {
    @Autowired
    HelloWorldServiceIF service;

    @Override
    public String greeting(String content) {
        return service.greeting(content);
    }
}
