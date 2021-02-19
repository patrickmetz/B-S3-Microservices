clear

echo "1/4: Stopping 'Load Balancing Gateway Service' in background."
pkill --signal 15 -f LoadBalancingGatewayService
sleep 1

echo "2/4: Stopping '2nd Hello World Service' in background."
pkill --signal 15 -f 2ndHelloWorldService
sleep 1

echo "3/4: Stopping '1st Hello World Service' in background."
pkill --signal 15 -f 1stHelloWorldService
sleep 1

echo "4/4: Stopping 'Registry Service' in background."
pkill --signal 15 -f RegistryService
sleep 1

echo "Done."