FROM openjdk:17.0.1-jdk-slim
ADD target/customer-api.jar customer-api.jar
ENTRYPOINT ["sh","-c","java -jar /customer-api.jar"]