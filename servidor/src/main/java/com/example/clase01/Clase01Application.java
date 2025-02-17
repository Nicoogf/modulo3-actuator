package com.example.clase01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Clase01Application {

	public static void main(String[] args) {
		SpringApplication.run(Clase01Application.class, args);
	}

}
