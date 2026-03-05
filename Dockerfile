# #Builde using Maven
# FROM maven:3.9.9-amazoncorretto-17 AS build

# WORKDIR /app

# #Copy project files
# COPY pom.xml .
# COPY src ./src

# #Package the application (skipping tests for performance)
# RUN mvn clean package -DskipTests

# Runtime image
FROM amazoncorretto:17

WORKDIR /app

#copy the generated JAR from the build stage
COPY target/Calculator-1.0-SNAPSHOT.jar /app/calculator.jar


#RUN the application
ENTRYPOINT ["java", "-jar", "calculator.jar"]
