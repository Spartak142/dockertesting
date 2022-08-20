# syntax=docker/dockerfile:1
FROM openjdk:11-jdk
VOLUME /tmp
 
RUN useradd -d /home/appuser -m -s /bin/bash appuser
USER appuser

COPY formhandler-latest.jar formhandler-latest.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/formhandler-latest.jar"]
EXPOSE 5000
