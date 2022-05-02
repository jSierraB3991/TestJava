FROM maven:3-openjdk-11 AS builder

WORKDIR /app
COPY . .
RUN mvn install


FROM openjdk:11.0-jre
COPY --from=builder /app/target/**.jar app.jar
CMD ["java", "-jar", "./app.jar"]

