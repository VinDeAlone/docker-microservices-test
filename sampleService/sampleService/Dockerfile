FROM openjdk:17-alpine 
WORKDIR /opt 
COPY /target/sampleService-0.0.1-SNAPSHOT.jar /opt/sampleService.jar
ENV port=8506
EXPOSE 8506
ENTRYPOINT [ "java", "-jar", "/opt/sampleService.jar" ]