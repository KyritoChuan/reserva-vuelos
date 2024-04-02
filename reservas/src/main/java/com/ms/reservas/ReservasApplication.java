package com.ms.reservas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@ComponentScan(basePackages = { "com.ms.reservas.controller", "com.ms.reservas.dao", "com.ms.reservas.services" })
@EnableJpaRepositories(basePackages = { "com.ms.reservas.dao", "com.ms.reservas.repositories" })
@EntityScan(basePackages = { "com.ms.reservas.models" })
@SpringBootApplication
@EnableDiscoveryClient
public class ReservasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservasApplication.class, args);
	}

	// Activa la libreria ribbon para acceder al servicio usando Eureka.
	@LoadBalanced
	@Bean
	public RestTemplate crearTemplate() {
		return new RestTemplate();
	}
}
