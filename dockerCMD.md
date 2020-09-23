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


docker-compose -f example/cluster-hostname.yaml up -d
docker-compose -f example/cluster-hostname.yaml stop

hostname -i

scp root@101.200.210.117:/home/docker/nacos/conf/*.sql  .

drop user 'nacos';
CREATE USER 'nacos'@'%' IDENTIFIED BY 'nacos';
select user, host from mysql.user; 
grant all privileges on *.* to 'nacos'@'%' with grant option;


docker run  -p 23306:23306 --name nacosMySql111 -e MYSQL_ROOT_PASSWORD=yanggumaji74520 -d  mysql


docker-compose -f docker-compose.yml up -d


docker run --name my-nginx -d -p 11111:80 nginx  -v /home/docker/nginx/nginx.conf nginx 

curl -L https://github.com/nginx/nginx/releases/download/1.19.2/release-1.19.2.tar.gz -o /home/docker/nginxTar

docker cp tmp-nginx-container:/etc/nginx/nginx.conf /home/docker/nginx.conf

docker run --name my-custom-nginx-container -p 11111:80 -v /home/nginx/www:/usr/share/nginx/html -v /home/nginx/conf/nginx.conf:/etc/nginx/nginx.conf  -v /home/nginx/logs:/var/log/nginx -d nginx
docker run --name my-custom-nginx-container -p 11111:80 -v /home/nginx/conf/nginx.conf:/etc/nginx/nginx.conf  -v /home/nginx/logs:/var/log/nginx -d nginx
#-v /home/nginx/www:/usr/share/nginx/html：将我们自己创建的 www 目录挂载到容器的 /usr/share/nginx/html。                                                        
# -v /home/nginx/conf/nginx.conf:/etc/nginx/nginx.conf：将我们自己创建的 nginx.conf 挂载到容器的 /etc/nginx/nginx.conf。
#-v /home/nginx/logs:/var/log/nginx：将我们自己创建的 logs 挂载到容器的 /var/log/nginx。 
/etc/hosts ipv6注释
upstream 是公网ip
mkdir -p /home/nginx/www /home/nginx/logs /home/nginx/conf


curl -L https://github.com/alibaba/Sentinel/releases/download/v1.8.0/sentinel-dashboard-1.8.0.jar -o /home/sentinel/sentineljar








seata 替换 file.conf 中的连接驱动