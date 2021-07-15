#
# Build stage
#
FROM maven:latest AS build
COPY src /home/app/src
COPY pom.xml /home/app
WORKDIR /home/app/

RUN mvn clean install


#
# Package stage
#

FROM adoptopenjdk/openjdk14:alpine
EXPOSE 8080
COPY --from=build /home/app/target/*.jar credit-service.jar
ENTRYPOINT ["java", "-jar", "/credit-service.jar"]