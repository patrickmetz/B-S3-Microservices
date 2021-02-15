@echo off 

start "Registry Service" java -jar .\registry_service\build\libs\registry_service-0.0.1-SNAPSHOT.jar

REM windows equivalent of sleeping 10 seconds
ping 127.0.0.1 -n 12 > nul

start "'Hello World'-Service 1/2" java -jar .\hello_world_service\build\libs\hello_world_service-0.0.1-SNAPSHOT.jar

ping 127.0.0.1 -n 12 > nul

start "'Hello World'-Service 2/2"  java -jar .\hello_world_service\build\libs\hello_world_service-0.0.1-SNAPSHOT.jar

ping 127.0.0.1 -n 12 > nul

start "Load Balancing Gateway Service"  java -jar .\load_balancing_gateway_service\build\libs\load_balancing_gateway_service-0.0.1-SNAPSHOT.jar
