package collections.ecom;

class Order {
	
    private int orderId;
    private String customerName;
    private double totalAmount;

    public Order(int orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    
    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Customer: " + customerName + ", Total Amount: $" + totalAmount;
    }
}
