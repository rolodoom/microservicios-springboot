package com.spb.app.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@EntityScan({ "com.spb.app.commons.models.entity" })
public class SpbServicioItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbServicioItemApplication.class, args);
	}

}
