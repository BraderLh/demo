package com.example.demo.controllers;

import com.example.demo.models.Product;
import com.example.demo.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://127.0.0.1:5173/")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> getProducts(){
        return productService.getAllProducts();
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        Product created = productService.addProduct(product);
        return ResponseEntity.ok(created);
    }

    @PutMapping
    public ResponseEntity<Product> updateProduct(@RequestBody Product product){
        Product updated = productService.updateProduct(product);
        return ResponseEntity.ok(updated);
    }
}

