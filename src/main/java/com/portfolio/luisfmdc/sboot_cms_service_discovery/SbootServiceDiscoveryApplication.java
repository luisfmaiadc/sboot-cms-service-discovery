package com.portfolio.luisfmdc.sboot_cms_service_discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SbootServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbootServiceDiscoveryApplication.class, args);
	}

}
