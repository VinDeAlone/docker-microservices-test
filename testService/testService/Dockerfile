FROM openjdk:17-alpine 
WORKDIR /opt 
COPY /target/testService-0.0.1-SNAPSHOT.jar /opt/demoService.jar
ENV port=8506 
EXPOSE 8506
ENTRYPOINT [ "java","-jar","/opt/demoService.jar" ]