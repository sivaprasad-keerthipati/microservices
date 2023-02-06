package com.microservice.item.add;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.microservice.item"
})
public class AddApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(AddApplication.class, args);
	}

}
