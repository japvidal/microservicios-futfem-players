package com.microservicios.app.futfem.players;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviciosFutfemPlayersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosFutfemPlayersApplication.class, args);
	}

}
