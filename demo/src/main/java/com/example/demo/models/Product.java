package com.example.demo.models;


import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Product {
    @Id
    private String id;
    private String name;
    private double unitPrice;
    private int quantity;

    public Product(String name, double unitPrice, int quantity) {


        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
