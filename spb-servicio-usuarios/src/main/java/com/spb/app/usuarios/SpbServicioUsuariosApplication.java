package com.spb.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({ "com.spb.app.commons.usuarios.models.entity" })
public class SpbServicioUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbServicioUsuariosApplication.class, args);
	}

}
