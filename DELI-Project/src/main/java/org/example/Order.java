package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item){
        items.add(item);
    }

    public double getOrderTotal(){
        double sum = 0;
        for(MenuItem item : items){
            sum += item.getCost();
        }
        return sum;
    }

    public void printOrderDetails() {
        System.out.println("Order Breakdown:");
        for (MenuItem item : items) {
            System.out.printf("- %s: $%.2f%n", item.getDescription(), item.getCost());
        }
        System.out.printf("Total Cost: $%.2f%n", getOrderTotal());
    }
}
