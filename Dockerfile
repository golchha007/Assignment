# Use an official Maven image as the base image
FROM maven:3.8.4-openjdk-17-slim AS build

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml and download the dependencies
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy the source code
COPY src ./src

# Build the application
RUN mvn package -DskipTests

# Create a new image with a smaller footprint
FROM eclipse-temurin:17-jre-jammy AS runtime

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/backend-0.0.1-SNAPSHOT.jar ./backend.jar

# Expose the port that your application listens on
EXPOSE 8080

# Set the command to run your application
CMD ["java", "-jar", "backend.jar"]
