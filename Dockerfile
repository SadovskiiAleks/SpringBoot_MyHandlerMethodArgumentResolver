FROM openjdk:17-alpine

EXPOSE 9199

COPY target/REST-0.0.1-SNAPSHOT.jar myFerstAppInDocker.jar

CMD ["java","-jar","myFerstAppInDocker.jar"]

