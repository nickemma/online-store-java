package com.ecommerce.orders;

import com.ecommerce.Customer;
import com.ecommerce.Product;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Order {
    private static final AtomicInteger counter = new AtomicInteger(0);
    private int orderID;
    private Customer customer;
    private List<Product> products;
    private double orderTotal;

    public Order(Customer customer, List<Product> products) {
        this.orderID = counter.incrementAndGet();
        this.customer = customer;
        this.products = products;
        this.orderTotal = products.stream().mapToDouble(Product::getPrice).sum();
    }

    public int getOrderID() {
        return orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public String generateOrderSummary() {
        return "Order{" +
                "orderID=" + orderID +
                ", customer=" + customer.getName() +
                ", products=" + products +
                ", orderTotal=" + orderTotal +
                '}';
    }
}