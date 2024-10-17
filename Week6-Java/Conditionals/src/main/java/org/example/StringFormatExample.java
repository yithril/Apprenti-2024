package org.example;

public class StringFormatExample {
    public static void main(String[] args) {
        //Instead of backticks and ${} we're going to use a function called printFormat
        String firstName = "Jonathan";
        String lastName = "Hop";

        System.out.printf("Hi my name is %s %s %n", firstName, lastName);

        //a letter grade
        char letterGrade = 'A';
        System.out.printf("Great job, you got a %c %n", letterGrade);

        //floats you can do something cool
        String productName = "Fizzy Lifting Drink";
        float price = 30.502384f;
        int quantity = 1;

        System.out.printf("Name: %s, Quantity: %d, Price: $%.2f", productName, quantity, price);
    }
}
