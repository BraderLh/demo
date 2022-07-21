package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Data
@AllArgsConstructor
public class Order {
    @Id
    private int id;
    private int numberOrder;
    private Date date;
    private ArrayList<Product> myProducts;
    private double finalPrice;


}
