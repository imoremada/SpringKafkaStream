## Spring Cloud Stream Kafka Example

This example shows a simple producer consumer example using spring cloud stream. This doesn't contains the security security aspects
Follow the steps given below to execute the project

Pre requisites (Commands given are for Windows environment) 
1) Download kafka
2) Start Zookeeper using this command - bin\windows\zookeeper-server-start.bat config\zookeeper.properties
3) Start Kafka using this command - bin\windows\kafka-server-start.bat config\server.properties
4) change the kafaka configurations(topic name etc..) mentioned in application-local.properties to suite your requirement 

Steps
1) Open the project in any IDE and execute below commands
    1. mvn install 
    2. mvn spring-boot:run
    3. curl -H "Content-Type: application/json" -X POST -d "hello world" http://localhost:8080/sendMessage