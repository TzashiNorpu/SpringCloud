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

docker run --name zipkin01 -d -p 29411:9411 openzipkin/zipkin
- 先修改端口映射关系
    - docker-compose -f example/standalone-derby.yaml up -d
    - docker-compose -f example/standalone-derby.yaml stop


docker run --name nginx01 -p 9977:80 -d nginx

curl -L https://github.com/docker/compose/releases/download/1.23.2/docker-compose-`uname -s`-`uname -m` -o /usr/bin/docker-compose

curl -L https://github.com/alibaba/nacos/releases/download/1.3.2/nacos-server-1.3.2.tar.gz -o /home/docker/nacos-server