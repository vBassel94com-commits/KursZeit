FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/payment-service.jar payment-service.jar

ENV SPRING_PROFILES_ACTIVE=docker

ENTRYPOINT ["java", "-jar", "payment-service.jar"]
