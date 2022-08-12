# DOCKERFILE
FROM maven:3.8.5-openjdk-17-slim

MAINTAINER rgabrielbrand rcgabrielbrand@gmail.com

COPY src ./src
COPY pom.xml ./pom.xml
WORKDIR ./

RUN mvn -f ./pom.xml clean package
RUN ls target

COPY target/plateau-api-*.jar ./target/plateau-api.jar

ENTRYPOINT ["java", "-jar", "./target/plateau-api.jar"]
