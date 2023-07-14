FROM eclipse-temurin:17-jdk-alpine
WORKDIR  /opt/heypet/
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]