package com.anir.mse.factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryApplication.class, args);
	}

}
