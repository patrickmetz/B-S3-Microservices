package de.patrickmetz.registry_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
/*
Die zentrale Applikationsklasse dieses Services.

Sie ist, durch die Annotation @EnableEurekaServer, in der Lage,
als Registry- und Discovery-Service zu fungieren, bei dem
Hello-World-Services sowohl registriert, als auch abgefragt,
werden können.
 */
public class RegistryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryServiceApplication.class, args);
    }

}
