FROM adoptopenjdk/openjdk14:alpine
EXPOSE 8080
COPY target/*.jar credit-service.jar
ENTRYPOINT ["java", "-jar", "/credit-service.jar"]