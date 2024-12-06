package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Review {
    public static void main(String[] args) {
        // 1. Java Fundamentals

        // Question: What are three examples of primitive data types in Java?
        // Provide your answer as comments or code demonstrating their declaration.

        // Question: What will happen when this code is run? Why?
        int[] numbers = {1, 2, 3, 4};
        // Uncomment to test:
        // System.out.println(numbers[4]);

        // Question: How does the `equals` method differ from `==`? Provide examples.
        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(s1 == s2); // Compare behavior of `==` and `equals`
        System.out.println(s1.equals(s2));

        // Question: Which of the following are valid identifiers? Why or why not?
        //int 1stValue;
        int _result = 0;
        //int class;
        int totalValue = 100;

        // 2. Object-Oriented Programming (OOP)

        // Question: What are the four pillars of OOP? Provide examples of how they manifest in Java.

        // Question: Discuss the purpose of encapsulation.
        class Student {
            public String name;
            public int age;
        }
        // How could this class be improved to protect its fields?

        // Question: Is this method overloading or overriding? Why?
        class OverloadExample {
            public void display(int number) {
                System.out.println("Number: " + number);
            }
            public void display(String text) {
                System.out.println("Text: " + text);
            }
        }

        // Question: How does inheritance promote code reuse? What are some of its drawbacks?

        // Question: What is polymorphism, and how can it be demonstrated in Java? Discuss examples.

        // 3. Constructors and the `this` Keyword

        // Question: What is wrong with this constructor? How would you fix it?
        class Car {
            private String make;
            private String model;

            public Car(String make, String model) {
                make = this.make; // Is this correct?
                model = this.model; // Is this correct?
            }
        }

        // Question: Will this code work as intended? Why or why not?
        class Person {
            private String name;

            public void setName(String name) {
                name = name; // Is this assignment effective?
            }
        }

        // 4. Abstract Classes and Interfaces

        // Question: What is the main distinction between an abstract class and an interface?

        abstract class Vehicle {
            public abstract void start();
        }
        interface Drivable {
            void drive();
        }

        // 5. Exception Handling

        // Question: What will this code output? What is the purpose of the `finally` block?
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Done.");
        }

        // 6. Java Collections

        // Question: What will happen when this code is run? Why?
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        // Uncomment to test:
        // System.out.println(items.get(2));

        // 7. Java Date and Time API

        // Question: What will the output of this code be? Why is this method useful?
        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfWeek());

        // 8. Advanced Concepts

        // Question: How does a default method in an interface differ from regular
        // interface methods?
        interface Printer {
            default void print() {
                System.out.println("Printing...");
            }
        }

        // Question: What is polymorphism? How does this code demonstrate it?
        class Animal {
            public void speak() {
                System.out.println("Animal speaks.");
            }
        }
        class Dog extends Animal {
            @Override
            public void speak() {
                System.out.println("Dog barks.");
            }
        }
        class Cat extends Animal {
            @Override
            public void speak() {
                System.out.println("Cat meows.");
            }
        }

        // Uncomment to test:
        // Animal myAnimal = new Dog();
        // myAnimal.speak(); // What will this output? Why?
    }
}
