package org.example;

public class Product {
    private double price;
    private String name;
    private Category category;

    public Product(double price, String name, Category category) {
        this.price = price;
        this.name = name;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
