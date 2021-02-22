clear

echo "1/8: 1st call to a 'Hello World Service'"
curl localhost:8080/hello
echo -e '\n'
sleep 1

echo "2/8: 2nd call to a 'Hello World Service'"
curl localhost:8080/hello
echo -e '\n'
sleep 1

echo "3/8: 3rd call to a 'Hello World Service'"
curl localhost:8080/hello
echo -e '\n'
sleep 1

echo "4/8: 4th call to a 'Hello World Service'"
curl localhost:8080/hello
echo -e '\n'
sleep 1

echo "5/8: 1st shutdown of a 'Hello World Service'"
curl -X POST localhost:8080/actuator/shutdown
echo -e '\n'
sleep 1

echo "6/8: 2nd shutdown of a 'Hello World Service'"
curl -X POST localhost:8080/actuator/shutdown
echo -e '\n'
sleep 1

echo "7/8: 5th call to a 'Hello World Service'"
curl localhost:8080/hello
echo -e '\n'
sleep 1

echo "8/8: 6th call to a 'Hello World Service'"
curl localhost:8080/hello
echo -e '\n'
sleep 1

echo "Done."
