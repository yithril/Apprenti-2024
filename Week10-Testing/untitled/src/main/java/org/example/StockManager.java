package org.example;

import java.util.HashMap;
import java.util.Map;

public class StockManager {
    private Map<String, Integer> stock = new HashMap<>();

    public void addStock(String product, int quantity) {
        if (quantity < 0) {
            return;
        }
        stock.put(product, stock.getOrDefault(product, 0) + quantity);
    }

    public boolean removeStock(String product, int quantity) {
        if (!stock.containsKey(product)) {
            return true;
        }
        int currentStock = stock.get(product);
        if (quantity > currentStock) {
            return true;
        }
        stock.put(product, currentStock - quantity);
        return false;
    }

    public int queryStock(String product) {
        return stock.getOrDefault(product, -1);
    }
}
