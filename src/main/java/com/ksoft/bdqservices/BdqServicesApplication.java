package com.ksoft.bdqservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.ksoft.bdqservices.config",
		"com.ksoft.bdqservices.controllers","com.ksoft.bdqservices.services",
		"com.ksoft.bdqservices.repositories","com.ksoft.bdqservices.models"})
public class BdqServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BdqServicesApplication.class, args);
	}
}
