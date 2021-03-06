package com.odontoweb.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.odontoweb.arquitetura", "com.odontoweb.microservice"})
@EnableJpaRepositories(basePackages = "com.odontoweb.microservice.impl.repository")
@EntityScan(basePackages = "com.odontoweb.microservice.impl.model")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
