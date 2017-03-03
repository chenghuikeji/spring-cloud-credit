package com.chenghui;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer1Application {

	public static void main(String[] args) {
//		SpringApplication.run(EurekaServer1Application.class, args);
		new SpringApplicationBuilder(EurekaServer1Application.class).web(true).run(args);
	}
}
