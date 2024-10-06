# Step 1: Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Step 2: Set the working directory in the container
WORKDIR /app

# Step 3: Copy the Spring Boot JAR file to the container
COPY target/devOpsDemoIntegration.jar app.jar

# Step 4: Expose the application port
EXPOSE 8080

# Step 5: Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
