FROM openjdk:11
ADD target/customer-service-0.0.1.jar customer-service-0.0.1.jar
EXPOSE 8088
ENTRYPOINT ["java","-jar","/customer-service-0.0.1.jar"]