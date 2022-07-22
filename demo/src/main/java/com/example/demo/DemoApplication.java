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

	// @Bean
	// CommandLineRunner runner(ProductRepository repository, OrderRepository orderRepository) {
	// 	return args -> {
	// 		ArrayList<ProductOrder> myProducts = new ArrayList<ProductOrder>();
	// 		List<Product> existingProducts = repository.findAll();
	// 		int finalPrice = 0;
	// 		for (Product product : existingProducts) {
	// 			int quantity = (int) (Math.random() * 10);
	// 			System.out.println("Product: " + product.getId());
	// 			myProducts.add(new ProductOrder(product, quantity));
	// 			finalPrice += product.getUnitPrice() * quantity;
	// 		}
	// 		Order order = new Order(1, new Date(), myProducts, finalPrice);
	// 		orderRepository.insert(order);
	// 	};
	// }
}
