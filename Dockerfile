FROM openjdk:17-alpine
add target/springboot-docker-mongo.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]