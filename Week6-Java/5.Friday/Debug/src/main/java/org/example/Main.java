package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Obvious error: comparing strings with '=='
        if (name.equalsIgnoreCase("Alice")) {
            System.out.println("Hello, Alice!");
        } else {
            System.out.println("You're not Alice!");
        }

        System.out.println("You are " + age + " years old.");

        scanner.close();
    }
}