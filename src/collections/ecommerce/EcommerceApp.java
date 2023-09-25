package collections.ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EcommerceApp {
    public static void main(String[] args) {
    	
        List<Product> products = new ArrayList<>();
        products.add(new Product("1", "Laptop", 999.99));
        products.add(new Product("2", "Smartphone", 699.99));
        products.add(new Product("3", "Coffee Maker", 99.99));
        products.add(new Product("4", "Running Shoes", 79.99));

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(products.get(0));
        cart.addItem(products.get(2));

        System.out.println("Selected Products:");
        cart.getItems().forEach(product -> System.out.println(product.getName()));

        
        double totalPrice = cart.getTotalPrice();
        System.out.println("Total Price: $" + totalPrice);

        
        // Data Filtering: Filter products based on a condition (e.g., price < 30)
        List<Product> filteredProducts = products.stream()
            .filter(product -> product.getPrice() < 100)
            .collect(Collectors.toList());

        System.out.println("\nFiltered Products (Price < $30):");
        filteredProducts.forEach(product -> System.out.println(product.getName()));

        
        // Data Transformation: Convert product names to uppercase
        List<String> productNamesInUpperCase = products.stream()
            .map(Product::getName)
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        System.out.println("\nProduct Names in Uppercase:");
        productNamesInUpperCase.forEach(System.out::println);

        
        // Data Aggregation: Find the average product price
        double averagePrice = products.stream()
            .mapToDouble(Product::getPrice)
            .average()
            .orElse(0.0);

        System.out.println("\nAverage Product Price: $" + averagePrice);

    }
}