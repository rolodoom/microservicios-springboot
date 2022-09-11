package com.spb.app.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({ "com.spb.app.commons.models.entity" })
public class SpbServicioProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbServicioProductosApplication.class, args);
	}

}
