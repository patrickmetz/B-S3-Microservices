package de.patrickmetz.hello_world_service.view;

/*
Öffentliche Schnittstelle eines Views, der zwischen
Endpunkt und Geschäftslogik arbeitet.

Dieser bereitet ausgehende Daten für die Auslieferung an Clients,
und eingehende Daten für die Verarbeitung durch Services, auf.

Er hätte, in einem komplexeren Szenario, dabei ggf. auch die Aufgabe
zwischen ein- und ausgehenden Datenformaten zu konvertieren.
*/
public interface HelloWorldViewIF<T> {
    /*Erzeugt eine Begrüßung für den Client.*/
    T greeting(String content);
}
