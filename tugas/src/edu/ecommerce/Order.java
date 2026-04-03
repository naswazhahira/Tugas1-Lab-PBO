package edu.ecommerce;

public class Order {
    private String orderId;
    private String customerName;
    private double total;

    public Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    // Inner Class OrderItem
    public class OrderItem {
        private String productName;
        private double price;
        private int quantity;

        public OrderItem(String productName, double price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public double getSubtotal() {
            return price * quantity;
        }

        public String getProductName() {
            return productName;
        }
    }

    public double hitungTotal(OrderItem[] items) {
        total = 0;
        for (OrderItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void tampilkanRincian(OrderItem[] items) {
        System.out.println("ID Pesanan   : " + orderId);
        System.out.println("Nama Pelanggan: " + customerName);
        System.out.println("-------------------------------------------");
        System.out.printf("%-15s %-15s %-5s %-10s\n", "Produk", "Harga", "Qty", "Subtotal");

        for (OrderItem item : items) {
            System.out.printf("%-15s %-15.2f %-5d %-10.2f\n",
                    item.getProductName(), item.price, item.quantity, item.getSubtotal());
        }

        System.out.println("-------------------------------------------");
        System.out.printf("TOTAL PEMBAYARAN: Rp %.2f\n", hitungTotal(items));
    }
}