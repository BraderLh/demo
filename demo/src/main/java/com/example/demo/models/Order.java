package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Data
@Document(collection = "orders")
public class Order {
    @Id
    private String id;
    private int numberOrder;
    private Date date;

    @DBRef
    private ArrayList<ProductOrder> myProducts;
    private double finalPrice;

    public Order(int numberOrder, Date date, ArrayList<ProductOrder> myProducts, double finalPrice) {
        this.numberOrder = numberOrder;
        this.date = date;
        this.myProducts = myProducts;
        this.finalPrice = finalPrice;
    }

}
