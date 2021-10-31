FROM openjdk:11.0.13-oraclelinux8

WORKDIR /app
ARG JARFILE=target/*.jar
COPY ${JARFILE} demo-app.jar

CMD ["java", "-jar", "demo-app.jar"]