package com.ms.vuelos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@ComponentScan(basePackages = { "com.ms.vuelos.controllers", "com.ms.vuelos.dao", "com.ms.vuelos.services" })
@EnableJpaRepositories(basePackages = { "com.ms.vuelos.dao", "com.ms.vuelos.repositories" })
@EntityScan(basePackages = { "com.ms.vuelos.models" })
@SpringBootApplication
public class VuelosApplication {

	public static void main(String[] args) {
		SpringApplication.run(VuelosApplication.class, args);
	}

}
