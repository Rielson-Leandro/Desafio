FROM openjdk:8-jdk-alpine

LABEL maintainer="rielson.leandro@gmail.com"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/Basec-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} Basec.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/Basec.jar"]