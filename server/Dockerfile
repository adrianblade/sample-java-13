FROM openjdk:8-jdk-alpine

COPY *.jar /server.jar

ENTRYPOINT exec java $JAVA_OPTS -jar server.jar