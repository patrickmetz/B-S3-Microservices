package de.patrickmetz.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/*
Die zentrale Applikationsklasse dieses Services.

Sie ist, durch die Annotation @EnableEurekaClient, in der Lage,
den Registry- und Discovery-Service periodisch nach verfügbaren
Hello-World-Services abzufragen.

Außerdem kann sie durch @EnableZuulProxy als zentrales Gateway
fungieren, dass Anfragen per Round-Robin-Verfahren an Hello-World-
Services verteilt.
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class LoadBalancingGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoadBalancingGatewayServiceApplication.class, args);
    }

}
