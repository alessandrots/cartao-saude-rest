# cartao-saude-rest
Cartão Assitência Saúde em Backend Java

__________________________________________________________________
==> openkbs/mysql-workbench:latest

docker run -it --rm --name mysql-workbench openkbs/mysql-workbench:latest
docker exec -it mysql-workbench sh

__________________________________________________________________

==> mysql:8.0.29 ***
https://hub.docker.com/_/mysql

--> run
docker run -it --rm --name mysql  \
-p 3306:3306 \
-e MYSQL_ROOT_PASSWORD=123456 \

--> OK 
docker run -it --rm --name mysql  \
-p 3306:3306 \
-e MYSQL_ROOT_PASSWORD=123456 \
-v $(pwd)/sample:/data/sample  \
 mysql:8.0.29

--> exec OK
docker exec -it mysql sh


> mysql -u root -p

__________________________________________________________________
> http://localhost:8090/api/v1/consultar-cliente/


__________________________________________________________________
properties:
server.port = 8090

# datasource
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/classicmodels
spring.datasource.username=root
spring.datasource.password=123456

# jpa
# spring.jpa.hibernate.ddl-auto=update
# spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults = false
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.properties.hibernate.default_schema=classicmodels
spring.jpa.show-sql=true
spring.datasource.validationQuery=SELECT 1

__________________________________________________________________

https://blog.devart.com/how-to-restore-mysql-database-from-backup.html

mysql -u [user name] –p [target_database_name] < [dumpfilename.sql]

http://localhost:8090/api/v1/consultar-cliente/

__________________________________________________________________

