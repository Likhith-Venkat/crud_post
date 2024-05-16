FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY ./build/libs/jobsposting-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "jobsposting-1.0-SNAPSHOT.jar"]