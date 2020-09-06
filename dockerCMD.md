1. docker pull
2. docker images
3. docker run --name mysql  -p 3306:3306 --restart always -d  imageId
    - docker run  -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=123456 -d  mysql
    
    

4. docker ps
5. docker stop containerId
6. docker rm containerId
7. docker exec -it containerId /bin/bash





```consul
docker pull consul:1.8.3
docker run -d -p 8500:8500 -v /data/consul:/consul/data -e CONSUL_BIND_INTERFACE='eth0' --name=consul_server_1 consul:1.6.1 agent -server -bootstrap -ui -node=1 -client='0.0.0.0'
```  
docker run --name consul1 -d -p 8500:8500 consul agent -server -bootstrap-expect 1 -ui -bind=0.0.0.0 -client=0 .0.0.0

