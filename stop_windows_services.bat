@echo off 

cls

echo 1/4: Stopping 'Registry Service' in background.
taskkill /FI "WindowTitle eq Registry Service"
echo:
REM windows equivalent of sleeping ca. 1 second
ping 127.0.0.1 -n 2 > nul

echo 2/4: Stopping '1st Hello World Service' in background.
taskkill /FI "WindowTitle eq 'Hello World'-Service 1/2"
echo:
ping 127.0.0.1 -n 2 > nul

echo 3/4: Stopping '2nd Hello World Service' in background.
taskkill /FI "WindowTitle eq 'Hello World'-Service 2/2"
echo:
ping 127.0.0.1 -n 2 > nul

echo 4/4: Stopping 'Load Balancing Gateway Service' in background.
taskkill /FI "WindowTitle eq Load Balancing Gateway Service"
echo:
ping 127.0.0.1 -n 2 > nul

echo Done.
pause
