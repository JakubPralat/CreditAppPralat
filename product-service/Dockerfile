FROM adoptopenjdk/openjdk14:alpine
EXPOSE 8082
COPY target/*.jar product-service.jar
ENTRYPOINT ["java", "-jar", "/product-service.jar"]