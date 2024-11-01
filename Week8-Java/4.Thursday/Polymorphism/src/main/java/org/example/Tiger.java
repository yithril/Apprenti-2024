package org.example;

public class Tiger extends Animal{
    public Tiger(String name, int age) {
        super(name, age);
    }

    //override
    //annotation - in java annotations begin with an @symbol
    //You put annotations above methods or properties sometimes above classes
    @Override
    public void eat(){
        System.out.println("The " + this.getName() + " stalks its prey");
    }

    @Override
    public void move(){
        System.out.println("The tiger slinks through the jungle.");
    }
}
