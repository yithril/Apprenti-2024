package org.example;

public class Monkey extends Animal {
    private String furColor;
    private double pawSize;

    public Monkey(int numberOfLegs, String name, char gender, double weight, String furColor, double pawSize) {
        super(numberOfLegs, name, gender, weight);
        this.furColor = furColor;
        this.pawSize = pawSize;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public double getPawSize() {
        return pawSize;
    }

    public void setPawSize(double pawSize) {
        this.pawSize = pawSize;
    }
}
