FROM openjdk:8
ADD SpringSampleProject-0.0.1-SNAPSHOT.jar /home/
EXPOSE 8084

CMD ["java","-jar","SpringSampleProject-0.0.1-SNAPSHOT.jar"]