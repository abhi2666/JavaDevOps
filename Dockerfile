# Use an official Maven image to build the application
FROM maven:3.6.3-jdk-8 AS build

# Set the working directory
WORKDIR /app

# Copy the pom.xml file and the source code to the container
COPY pom.xml .
COPY src ./src

# Package the application
RUN mvn clean package

# Use an OpenJDK image to run the application
FROM openjdk:8-jre-alpine

# Set the working directory
WORKDIR /app

# Copy the packaged jar file from the build stage
COPY --from=build /app/target/my-app-1.0-SNAPSHOT.jar ./my-app.jar

# Specify the command to run the application
CMD ["java", "-jar", "my-app.jar"]
