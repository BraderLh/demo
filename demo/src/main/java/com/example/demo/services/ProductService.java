package com.example.demo.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product addProduct(Product order) {
        return productRepository.save(order);
    }

    public Product updateProduct(Product order) {
        return productRepository.insert(order);
    }
}