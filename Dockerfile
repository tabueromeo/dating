
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM openjdk:22-jdk
COPY build/libs/dating-0.0.1-SNAPSHOT.jar dating-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/dating-0.0.1-SNAPSHOT.jar"]

CMD ["/bin/sh"]
