package com.ieti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan( basePackages = "com.ieti" )
public class UsermsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsermsApplication.class, args);
	}

}
