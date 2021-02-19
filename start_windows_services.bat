@echo off 

cls

echo 1/4: Starting 'Registry Service' in background.
start /min "Registry Service" java -jar .\registry_service\build\libs\registry_service-0.0.1-SNAPSHOT.jar
echo Waiting 15 seconds.
echo:
REM windows equivalent of sleeping 15 seconds
ping 127.0.0.1 -n 18 > nul

echo 2/4: Starting '1st Hello World Service' in background.
start /min "'Hello World'-Service 1/2" java -jar .\hello_world_service\build\libs\hello_world_service-0.0.1-SNAPSHOT.jar
echo Waiting 15 seconds.
echo:
ping 127.0.0.1 -n 18 > nul

echo 3/4: Starting '2nd Hello World Service' in background.
start /min "'Hello World'-Service 2/2"  java -jar .\hello_world_service\build\libs\hello_world_service-0.0.1-SNAPSHOT.jar
echo Waiting 15 seconds.
echo:
ping 127.0.0.1 -n 18 > nul

echo 4/4: Starting 'Load Balancing Gateway Service' in background.
start /min "Load Balancing Gateway Service"  java -jar .\load_balancing_gateway_service\build\libs\load_balancing_gateway_service-0.0.1-SNAPSHOT.jar
echo Waiting 15 seconds.
echo:
ping 127.0.0.1 -n 18 > nul

echo Done.
pause
