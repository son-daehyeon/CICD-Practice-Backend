FROM openjdk:21-jdk

WORKDIR /app

COPY build/libs/app.jar /app/app.jar

CMD ["java", "-jar", "app.jar"]
