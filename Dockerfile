FROM openjdk:21
EXPOSE 8080

ADD target/habit-tracker.jar habit-tracker.jar
ENTRYPOINT ["java", "-jar", "/habit-tracker.jar"]
