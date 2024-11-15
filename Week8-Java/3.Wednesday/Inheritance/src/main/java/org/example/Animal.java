package org.example;

public class Animal {
    private int numberOfLegs;
    private String name;
    private char gender;
    private double weight;

    public Animal(int numberOfLegs, String name, char gender, double weight){
        this.numberOfLegs = numberOfLegs;
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private void groom(){
        System.out.println("The animal grooms itself");
    }
}
