# Use a base image with a Java Runtime Environment (JRE)
FROM openjdk:24-jdk-slim

# Set the working directory inside the container
WORKDIR /LeaveManagementSystem

# Copy the Spring Boot application's JAR file into the container
# Assuming your build generates a JAR named 'your-application.jar' in the 'target' directory
COPY target/LeaveManagementSystem-0.0.1-SNAPSHOT.jar LeaveManagementSystem-0.0.1-SNAPSHOT.jar

# Expose the port your Spring Boot application listens on (default is 8080)
EXPOSE 8080

# Define the command to run your Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]