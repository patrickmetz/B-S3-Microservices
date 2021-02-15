echo "1/4: Stopping 'Load Balancing Gateway Service' in background."
pkill --signal 15 -f LoadBalancingGatewayService

echo "2/4: Stopping '2nd Hello World Service' in background."
pkill --signal 15 -f 2ndHelloWorldService

echo "3/4: Stopping '1st Hello World Service' in background."
pkill --signal 15 -f 1stHelloWorldService

echo "4/4: Stopping 'Registry Service' in background."
pkill --signal 15 -f RegistryService

echo "Done."