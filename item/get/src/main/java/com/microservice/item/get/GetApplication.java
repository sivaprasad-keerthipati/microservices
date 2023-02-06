package com.microservice.item.get;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.microservice.item"
})
public class GetApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetApplication.class, args);
	}

}
