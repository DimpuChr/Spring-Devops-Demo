# Use an official OpenJDK runtime as a parent image
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the application JAR file from the host machine to the container
COPY target/Spring-Devops-Demo-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port that the Spring Boot app will run on
EXPOSE 8080

# Command to run the JAR file
ENTRYPOINT ["java","-jar","/app/app.jar"]