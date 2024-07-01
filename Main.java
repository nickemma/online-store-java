import com.ecommerce.Customer;
import com.ecommerce.Product;
import com.ecommerce.orders.Order;

import java.util.List;

public class Main {
  public static void main(String[] args) {
        // Create products
        Product product1 = new Product(1, "Laptop", 1000);
        Product product2 = new Product(2, "Smartphone", 500);

        // Display products
        System.out.println(product1);
        System.out.println(product2);
        System.out.println("====================================================");

        // Create a customer
        Customer customer = new Customer(1, "Akpobome Jessica");
    // Add products to shopping cart
      customer.addToCart(product1);
      customer.addToCart(product2);
       //customer.removeFromCart(product2);
    
        // Display customer details
        System.out.println(customer);
    System.out.println("====================================================");
  
        // Calculate total cost of shopping cart
        System.out.println("Total cost: " + customer.calculateTotalCost());
    System.out.println("====================================================");
        // Create an order
        Order order = new Order(customer, customer.getShoppingCart());

        // Display order summary
        System.out.println(order.generateOrderSummary());
    }
}