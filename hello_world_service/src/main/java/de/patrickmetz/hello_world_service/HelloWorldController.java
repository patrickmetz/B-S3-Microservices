package de.patrickmetz.hello_world_service;

import de.patrickmetz.hello_world_service.view.HelloWorldViewIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/*
Stellt den öffentlichen Endpunkt "/hello" via HTTP/GET zur Verfügung.
Kann durch @RestController auf verschiedene HTTP-Anfragen reagieren.
 */
@RestController
public class HelloWorldController {

    /* Bindet einen View entkoppelt via Dependency Injection ein.*/
    @Autowired
    HelloWorldViewIF<String> viewString;

    /*
    * Aktiviert den Endpunkt "/hello" und leitet die zugehörige Anfrage
    * an einen View, gemäß des MVVM-Patterns weiter.
    * */
    @GetMapping(path = "/hello")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return viewString.greeting(name);
    }
}

