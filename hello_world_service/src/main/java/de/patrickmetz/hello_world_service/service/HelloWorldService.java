package de.patrickmetz.hello_world_service.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/*
Siehe Interface-Dokumentation.
*/
@Service
public class HelloWorldService implements HelloWorldServiceIF {
    private static final String TEMPLATE = "Hello, %s!\r\nThis is visit no. %d.\r\nMy id is: %s.";

    /* Die Identität des Services, gemäß Konfiguration.*/
    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    /* Zählt die Anzahl der Service-Instanz-Aufrufe.*/
    private static int counter = 0;

    @Override
    public String greeting(String greeting) {
        return String.format(TEMPLATE, greeting, ++counter, instanceId);
    }
}
