package de.patrickmetz.hello_world_service.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService implements HelloWorldServiceIF {
    public static final String TEMPLATE = "Hello, %s! This is visit no. %d.";

    //todo: replace with service id
    private static int counter = 0;

    @Override
    public String greeting(String greeting) {
        return String.format(TEMPLATE, greeting, ++counter);
    }
}
