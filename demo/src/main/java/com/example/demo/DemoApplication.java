package com.example.demo;

import com.example.demo.models.Order;
import com.example.demo.models.Product;
import com.example.demo.models.ProductOrder;
import com.example.demo.repositories.OrderRepository;
import com.example.demo.repositories.ProductRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

/*	@Bean
	CommandLineRunner runner(ProductRepository repository) {
		return args -> {
			Product product = new Product(
					"Lighter",
					2.50
			);
			repository.insert(product);
		};
	}*/

//		@bean
//		commandlinerunner runner (productrepository repository, orderrepository orderrepository){
//			return args -> {
//				arraylist<productorder> myproducts = new arraylist<productorder>();
//				list<product> existingproducts = repository.findall();
//				int finalprice = 0;
//				for (product product : existingproducts) {
//					int quantity = (int) (math.random() * 10);
//					system.out.println("product: " + product.getid());
//					myproducts.add(new productorder(product, quantity));
//					finalprice += product.getunitprice() * quantity;
//				}
//				order order = new order(1, new date(), myproducts, finalprice);
//				orderrepository.insert(order);
//			};
//		}
}