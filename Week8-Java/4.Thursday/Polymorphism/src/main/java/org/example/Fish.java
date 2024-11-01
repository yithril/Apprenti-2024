package org.example;

public class Fish extends Animal implements Playable {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        System.out.println("Swims through the sea");
    }

    @Override
    public void playWithOwner() {
        System.out.println("Watch them swim in the aquarium.");
    }
}
