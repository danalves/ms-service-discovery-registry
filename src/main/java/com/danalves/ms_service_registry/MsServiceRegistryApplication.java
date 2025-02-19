package com.danalves.ms_service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsServiceRegistryApplication.class, args);
	}

}
