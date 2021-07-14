FROM adoptopenjdk/openjdk14:alpine
EXPOSE 8081
COPY target/*.jar customer-service.jar
ENTRYPOINT ["java", "-jar", "/customer-service.jar"]