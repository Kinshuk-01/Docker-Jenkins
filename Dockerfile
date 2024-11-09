# Dockerfile by Kinshuk
FROM maven:3.8.4-openjdk-17 AS builder
WORKDIR /app

COPY pom.xml .
COPY . .

RUN mvn clean package

FROM openjdk:17
WORKDIR /app

COPY --from=builder /app/target/demo-0.0.1-SNAPSHOT.jar demo.jar

EXPOSE 5000
ENTRYPOINT ["java", "-jar", "demo.jar"]
