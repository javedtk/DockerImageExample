FROM openjdk:22
EXPOSE 8083
ADD target/springboot-images-githubaction.jar springboot-images-githubaction.jar
ENTRYPOINT ["java","-jar","/springboot-images-githubaction.jar"]