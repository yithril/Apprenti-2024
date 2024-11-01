package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird blueJay = new Bird("Blue Jay", 1);
        Fish fish = new Fish("Nemo", 2);
        Tiger tiger = new Tiger("Tony the Tiger", 50);

        blueJay.eat();
        fish.eat();
        tiger.eat();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(blueJay);
        animalList.add(fish);
        animalList.add(tiger);

        for(Animal animal : animalList){
            System.out.println(animal.getClass());
            if(animal instanceof Bird){
                ((Bird) animal).sing();
            }
        }

        Object o = new Object();

        List<Playable> pets = new ArrayList<>();

        pets.add(blueJay);
        pets.add(fish);
        //pets.add(tiger);
    }
}