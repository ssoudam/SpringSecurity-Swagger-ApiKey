package com.db.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;


@SpringBootApplication
@ComponentScan ({"com.db.config", "com.db.controllers","com.db.domain"})
public class SwaggerSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerSecurityApplication.class, args);
	}
}
