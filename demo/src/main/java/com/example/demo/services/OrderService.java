package com.example.demo.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.models.Order;
import com.example.demo.repositories.OrderRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderService {
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(Order order) {
        return orderRepository.insert(order);
    }
}
