FROM openjdk:17
VOLUME /tmp
EXPOSE 8090
ADD ./target/spb-servicio-gateway-server-0.0.1-SNAPSHOT.jar servicio-gateway-server.jar
ENTRYPOINT [ "java", "-jar", "/servicio-gateway-server.jar" ]