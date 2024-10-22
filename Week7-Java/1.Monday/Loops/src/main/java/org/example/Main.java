package org.example;

public class Main {
    public static void main(String[] args) {
        //for loops
        for(int i = 1; i < 11; i++){
            //System.out.println(i);
        }

        int i = 10;
        while(i > 0){
            //System.out.println(i);
            i--;
        }

        //we use arrays in situations where there are a fixed
        //number of slots available.
        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        int[] numbers2 = { 10, 20, 30, 40, 50 };

        String[] fruits = { "strawberry", "orange", "mango", "pineapple" };

        //classes and arrays are used together all the time
        Person[] candidates = new Person[3];

        candidates[0] = new Person("Bob Smith", 25);
        candidates[1] = new Person("Marie Johnson", 30);
        candidates[2] = new Person("Joe Everyman", 40);

        Person[] newCandidates = { new Person("Superman", 20),
                new Person("Green Lantern", 59),
                new Person("Mary Smith", 20) };

        //enhanced for loop
        for(Person person : candidates){
            System.out.println(person.getName());
        }
    }
}