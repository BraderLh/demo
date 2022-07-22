package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.Product;


public interface ProductRepository extends MongoRepository<Product, String> {

}
