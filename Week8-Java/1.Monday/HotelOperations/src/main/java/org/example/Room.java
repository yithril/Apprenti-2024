package org.example;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;
    }

    public int getNumberOfBeds(){
        return this.numberOfBeds;
    }

    public double getPrice(){
        return this.price;
    }

    public boolean isOccupied() {
        return this.occupied;
    }

    public boolean isDirty(){
        return this.dirty;
    }

    public boolean isAvailable(){
        return !this.dirty && !this.occupied;
    }
}
