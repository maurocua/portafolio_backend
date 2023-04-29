FROM amazoncorretto:8-alpine-jdk

MAINTAINER mauro_cuassolo

COPY target/mauro-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]