package com.revature.caliber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class PanelRepositoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PanelRepositoryServiceApplication.class, args);
	}

}
