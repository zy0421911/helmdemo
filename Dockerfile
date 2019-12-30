FROM java:8   
ADD /target/k8s-api-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["/usr/bin/java","-jar","app.jar"]