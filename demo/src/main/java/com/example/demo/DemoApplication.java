package com.example.demo;

import com.example.demo.models.Product;
import com.example.demo.models.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ProductRepository repository){
		return args -> {
			Product product = new Product("Pipe", 30.00, 2);
		};
	}
}
