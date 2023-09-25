package collections.ecom;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class EcommerceApp {
	


    public static void main(String[] args) {
        Queue<Order> orderQueue = new LinkedList<>();

        // Simulating incoming customer orders
        orderQueue.add(new Order(1, "Alice", 100.0));
        orderQueue.add(new Order(2, "Bob", 200.0));
        orderQueue.add(new Order(3, "Charlie", 150.0));
        orderQueue.add(new Order(4, "David", 180.0));

      
        // Transforming the queue into a list of orders
        List<Order> orderList = new ArrayList<>(orderQueue);
        System.out.println("All Customer Orders:");
        orderList.forEach(System.out::println);
        
       
     // Simulating new incoming orders after processing
        orderQueue.add(new Order(5, "Eve", 120.0));
        orderQueue.add(new Order(6, "Frank", 220.0));

        System.out.println("\nProcessing Orders:");
        // Process orders again after orders update...
        while (!orderQueue.isEmpty()) {
            Order order = orderQueue.poll();
            System.out.println("Processed: " + order);
        }
        
        // Filtering orders with a total amount greater than 150
        List<Order> highValueOrders = orderList.stream()
                .filter(order -> order.getTotalAmount() > 150)
                .collect(Collectors.toList());

        System.out.println("\nHigh-Value Orders:");
        highValueOrders.forEach(System.out::println);

        // Calculating the total revenue from all orders
        double totalRevenue = orderList.stream()
                .mapToDouble(Order::getTotalAmount)
                .sum();

        System.out.println("\nTotal Revenue: $" + totalRevenue);

        
        orderQueue.add(new Order(7, "Rick", 250.0));
        orderQueue.add(new Order(8, "Coery", 420.0));
        
        // Processing orders by removing them from the queue
        System.out.println("\nProcessing Orders:");
        while (!orderQueue.isEmpty()) {
            Order order = orderQueue.poll();
            System.out.println("Processing: " + order);
        }
      
    }
}
