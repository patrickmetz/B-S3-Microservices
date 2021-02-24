package de.patrickmetz.hello_world_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/* Die zentrale Applikationsklasse dieses Services.

* Sie ist, durch die Annotation @EnableEurekaClient in der Lage,
* den Registry- und Discovery-Service zu kontaktieren.
*/
@SpringBootApplication
@EnableEurekaClient
public class HelloWorldServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldServiceApplication.class, args);
    }

}
