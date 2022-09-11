package com.spb.app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpbServicioConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbServicioConfigServerApplication.class, args);
	}

}
