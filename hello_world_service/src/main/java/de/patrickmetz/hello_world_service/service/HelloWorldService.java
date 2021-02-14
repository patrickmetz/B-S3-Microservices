package de.patrickmetz.hello_world_service.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService implements HelloWorldServiceIF {
    private static final String TEMPLATE = "Hello, %s!<br/>This is visit no. %d.<br/><br/>My id is %s.";

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    private static int counter = 0;

    @Override
    public String greeting(String greeting) {
        return String.format(TEMPLATE, greeting, ++counter, instanceId);
    }
}
