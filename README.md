# Hausarbeit - Projektseminar Microservices
 - Wintersemester 2020 / 2021
 - [Homepage Hochschule Bonn-Rhein-Sieg](https://www.h-brs.de)

## Ziel
 - Prototypische Entwicklung einer Microservice-Architektur

## Ergebnis
- Funktionalität
  - zwei Spring-Boot-basierte Microservice-Instanzen
    - registrieren Sich bei einer Instanz von Netflix Eureka
   - eine [Netflix Eureka](https://github.com/Netflix/eureka)-Instanz
      - Registry- und Discovery-Server, der Microservices registriert und überwacht
   - eine [Netflix Zuul](https://github.com/Netflix/zuul)-Instanz
      - Load-Balancer, der HTTP-Anfragen von Clients an Microservices vermittelt
        - hier im Round-Robin-Verfahren 
- Live-Demo
  - entsprechende Batch- oder Shell-Datei ausführen
  - http://localhost:8080/hello aufrufen
  - Clients übernehmen sukzessive Aufrufe erkennbar alternierend
