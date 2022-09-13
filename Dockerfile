FROM openjdk:8-jdk-alpine
MAINTAINER bowang
#VOLUME /tmp
COPY ./target/butterfly-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8088
ENTRYPOINT ["java","-jar","/app.jar"]