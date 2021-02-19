clear

echo "1/4: Starting 'Registry Service' in background."
bash -c "exec -a RegistryService java -jar ./registry_service/build/libs/registry_service-0.0.1-SNAPSHOT.jar &>/dev/null &"
echo "Waiting 15 seconds."
echo -e '\n'
sleep 15

echo "2/4: Starting '1st Hello World Service' in background."
bash -c "exec -a 1stHelloWorldService java -jar ./hello_world_service/build/libs/hello_world_service-0.0.1-SNAPSHOT.jar &>/dev/null &"
echo "Waiting 15 seconds."
echo -e '\n'
sleep 15

echo "3/4: Starting '2nd Hello World Service' in background."
bash -c "exec -a 2ndHelloWorldService java -jar ./hello_world_service/build/libs/hello_world_service-0.0.1-SNAPSHOT.jar &>/dev/null &"
echo "Waiting 15 seconds."
echo -e '\n'
sleep 15

echo "4/4: Starting 'Load Balancing Gateway Service' in background."
bash -c "exec -a LoadBalancingGatewayService java -jar ./load_balancing_gateway_service/build/libs/load_balancing_gateway_service-0.0.1-SNAPSHOT.jar &>/dev/null &"
echo "Waiting 15 seconds."
echo -e '\n'
sleep 15

echo "Done."
