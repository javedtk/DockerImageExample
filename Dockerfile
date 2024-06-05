FROM openjdk : 22
EXPOSE 8083
ADD target/spring-boot-application.jar spring-boot-application.jar
ENTRYPOINT ["java","-jar","/spring-boot-application.jar"]