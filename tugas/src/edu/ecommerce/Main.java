package edu.ecommerce;

public class Main {
    public static void main(String[] args) {
        Order myOrder = new Order("ORD-2026-001", "Budi Santoso");

        Order.OrderItem[] listBelanja = new Order.OrderItem[3];
        listBelanja[0] = myOrder.new OrderItem("Laptop Gaming", 15000000, 1);
        listBelanja[1] = myOrder.new OrderItem("Mouse Wireless", 250000, 2);
        listBelanja[2] = myOrder.new OrderItem("Headset Blue", 750000, 1);

        myOrder.tampilkanRincian(listBelanja);
    }
}