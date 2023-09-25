package collections.ecommerce;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
	
    private List<Product> items = new ArrayList<>();

    public void addItem(Product product) {
        items.add(product);
    }

    public List<Product> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return items.stream()
            //.mapToDouble(Product::getPrice)
        	 .mapToDouble(product -> product.getPrice())
            .sum();
    }
}
