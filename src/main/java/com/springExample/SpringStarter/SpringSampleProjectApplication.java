package com.springExample.SpringStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSampleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSampleProjectApplication.class, args);
		System.out.println("Hello SpringBoot");
	}

}
