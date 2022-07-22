package com.example.demo.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.Order;


public interface OrderRepository extends MongoRepository<Order, String> {
    
}
