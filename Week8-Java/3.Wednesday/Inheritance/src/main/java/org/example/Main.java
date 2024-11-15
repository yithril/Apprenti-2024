package org.example;

public class Main {
    public static void main(String[] args) {
        Monkey monkey = new Monkey(4, "Curious George", 'M', 100, "brown", 10);
        monkey.setName("Curious George");
        monkey.setGender('M');
        monkey.setNumberOfLegs(4);

        monkey.setFurColor("brown");
        monkey.setPawSize(20);
    }
}