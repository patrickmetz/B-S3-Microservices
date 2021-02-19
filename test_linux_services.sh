clear

echo "1st call to a 'Hello World Service'"
curl localhost:8080/hello
echo -e '\n'
sleep 1

echo "2nd call to a 'Hello World Service'"
curl localhost:8080/hello
echo -e '\n'
sleep 1

echo "3rd call to a 'Hello World Service'"
curl localhost:8080/hello
echo -e '\n'
sleep 1

echo "4th call to a 'Hello World Service'"
curl localhost:8080/hello
echo -e '\n'
sleep 1

echo "1st shutdown of a 'Hello World Service'"
curl -X POST localhost:8080/actuator/shutdown
echo -e '\n'
sleep 1

echo "2nd shutdown of a 'Hello World Service'"
curl -X POST localhost:8080/actuator/shutdown
echo -e '\n'
sleep 1

echo "Done."
