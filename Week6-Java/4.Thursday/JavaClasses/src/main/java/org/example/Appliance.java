package org.example;

public class Appliance {
    private String color;
    private double size;
    private double cost;
    private String brand;
    private boolean onSale;

    public Appliance(String color, double size, double cost, String brand, boolean onSale) {
        this.color = color;
        this.size = size;
        this.cost = cost;
        this.brand = brand;
        this.onSale = onSale;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }
}
