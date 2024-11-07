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
}
