package de.patrickmetz.hello_world_service.service;

/*
Öffentliche Schnittstelle eines Services, der unterhalb
von Views und Geschäftslogik arbeitet.

Dieser beinhaltet die eigentliche, von den Views entkoppelte,
Geschäftslogik, die die Anfragen bearbeitet.
*/
public interface HelloWorldServiceIF {
    /*Erzeugt eine Begrüßung für den View.*/
    String greeting(String greeting);
}
