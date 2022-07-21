package com.example.demo.models;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ProductRepository extends MongoRepository<Product, String> {

}
