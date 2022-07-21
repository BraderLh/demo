package com.example.demo.models;

import java.util.ArrayList;

public class Controller {
    private ArrayList<Order> order;

    public void setOrder(ArrayList<Order> order) {
        this.order = order;
    }

    public void showOrders(ArrayList<Order> order) {
        order.toString();
    }

    public void addOrder(ArrayList<Order> order, Order p) {
        p = new Order(0,0,null,null,0.0);
        if(order.isEmpty()) {

            order.add(p);
        }
    }
    public void deleteOrder(ArrayList<Order> order, int id){
        if(order.contains(order.get(id))){
            order.remove(id);
        }
    }
}

