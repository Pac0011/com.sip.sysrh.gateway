package com.sip.sysrh.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SysrhGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SysrhGatewayApplication.class, args);
	}

}
