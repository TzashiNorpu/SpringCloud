1. docker pull
2. docker images
3. docker run --name mysql  -p 3306:3306 --restart always -d  imageId
4. docker ps
5. docker stop containerId
6. docker rm containerId
7. docker exec -it containerId /bin/bash



$ docker run -it --rm --link some-zookeeper:zookeeper zookeeper zkCli.sh -server zookeeper
