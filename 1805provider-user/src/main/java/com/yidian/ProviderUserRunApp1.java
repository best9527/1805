package com.yidian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class ProviderUserRunApp1 {
	
	public static void main(String[] args) {
		SpringApplication.run(ProviderUserRunApp1.class, args);
		
	}
}
