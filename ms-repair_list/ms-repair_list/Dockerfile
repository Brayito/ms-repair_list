FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} ms-repair_list.jar
ENTRYPOINT ["java","-jar","/ms-repair_list.jar"]