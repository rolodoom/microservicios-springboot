# microservicios-springboot

Código de práctica para el curso [07 Microservicios con Spring Boot y Spring Cloud Netflix Eureka](https://ibmcsr.udemy.com/course/microservicios-con-spring-boot-y-spring-cloud/)

## Comandos

### Generar JAR

```
.\mvnw clean package
```

Para evitar problemas referentes a la base de datos.

```
.\mvnw clean package -DskipTests
```

### Docker build image

```
docker build -t nombre-servicio:v1 .
```
