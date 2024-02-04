FROM openjdk:21

#Projemizin olduğu yeri gösteriyoruz ve kopyalıyoruz
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} habit-tracker.jar

#Çalışacağı portu belirliyoruz
EXPOSE 9980

#Projemizi calistıracak komutu yazıyoruz.
ENTRYPOINT ["java","-jar","/habit-tracker.jar"]