FROM openjdk:17-alpine
ADD target/customer-api.jar  customer-api.jar
ENTRYPOINT ["sh","-c","java -jar /customer-api.jar"]