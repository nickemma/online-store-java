package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerID;
    private String name;
    private List<Product> shoppingCart;

    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.shoppingCart = new ArrayList<>();
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addToCart(Product product) {
        shoppingCart.add(product);
    }

    public void removeFromCart(Product product) {
        shoppingCart.remove(product);
    }

    public double calculateTotalCost() {
        return shoppingCart.stream().mapToDouble(Product::getPrice).sum();
    }

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", shoppingCart=" + shoppingCart +
                '}';
    }
}
