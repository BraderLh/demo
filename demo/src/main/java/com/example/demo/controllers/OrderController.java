package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.Order;
import com.example.demo.services.OrderService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/orders")
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping
    public List<Order> getOrders(){
        return orderService.getAllOrders();
    }

    @PostMapping
    public ResponseEntity<Order> addOrder(@RequestBody Order order){
        Order created = orderService.addOrder(order);
        return ResponseEntity.ok(created);
    }

    @PutMapping
    public ResponseEntity<Order> updateOrder(@RequestBody Order order){
        Order updated = orderService.updateOrder(order);
        return ResponseEntity.ok(updated);
    }
}

