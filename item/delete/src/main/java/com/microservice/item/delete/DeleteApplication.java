package com.microservice.item.delete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.microservice.item"
})
public class DeleteApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeleteApplication.class, args);
	}

}
