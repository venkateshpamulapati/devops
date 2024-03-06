#MULTI SATGE build
#1: TO build the jar
FROM openjdk:17-slim-bullseye as builder
ARG PROJECT_PATH=/opt/demo
WORKDIR ${PROJECT_PATH}
RUN pwd
COPY .gradle .gradle
COPY gradle gradle
RUN java -version
COPY gradlew gradlew.bat build.gradle settings.gradle ./
COPY ./src ./src
#RUN ls -l /opt/demo
RUN ${PROJECT_PATH}/gradlew clean build


#2: To Run the jar
FROM openjdk:17-slim-bullseye
ARG PROJECT_PATH=/opt/demo
WORKDIR ${PROJECT_PATH}
#ARG JAR_FILE=build/libs/demo-0.0.1-SNAPSHOT.jar
#COPY ${JAR_FILE} demo-0.0.1-SNAPSHOT.jar
COPY --from=builder ${PROJECT_PATH}/build/libs/*.jar ${PROJECT_PATH}/demo.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "/opt/demo/demo.jar"]
