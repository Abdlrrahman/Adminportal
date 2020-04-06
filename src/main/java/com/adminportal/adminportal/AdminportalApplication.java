package com.adminportal.adminportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class })
@ComponentScan("com.adminportal.controller")
@EntityScan("com.adminportal.domain")
public class AdminportalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminportalApplication.class, args);
	}

}
