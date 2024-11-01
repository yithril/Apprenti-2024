package org.example;

public class Bird extends Animal implements Playable {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        System.out.println("Flies through the sky!");
    }

    public void sing(){
        System.out.println("Sings a pretty melody");
    }

    @Override
    public String toString() {
        return "Bird{}";
    }

    @Override
    public void playWithOwner() {
        System.out.println("Feed them seed and hear them sing.");
    }
}
