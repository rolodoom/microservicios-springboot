package com.spb.app.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
// @EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class SpbServicioOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbServicioOauthApplication.class, args);
	}

}
