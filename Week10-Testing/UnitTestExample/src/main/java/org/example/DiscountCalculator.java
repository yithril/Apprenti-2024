package org.example;

public class DiscountCalculator {
    public double calculateDiscount(double price, int quantity) {
        if (quantity < 1 || price < 0) {
            throw new IllegalArgumentException("Invalid price or quantity");
        }
        double discount = 0;
        if (quantity >= 10) {
            discount = 0.20; // 20% discount for 10 or more items
        } else if (quantity >= 5) {
            discount = 0.10; // 10% discount for 5-9 items
        }
        return price * (1 - discount);
    }
}
