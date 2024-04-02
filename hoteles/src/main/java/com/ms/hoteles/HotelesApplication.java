package com.ms.hoteles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = { "com.ms.hoteles.controllers", "com.ms.hoteles.dao", "com.ms.hoteles.services" })
@EntityScan(basePackages = { "com.ms.hoteles.models" })
@EnableJpaRepositories(basePackages = { "com.ms.hoteles.dao", "com.ms.hoteles.repositories" })
@SpringBootApplication
@EnableDiscoveryClient
public class HotelesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelesApplication.class, args);
	}

}
