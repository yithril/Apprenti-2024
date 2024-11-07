package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1 - Add Sandwich");
            System.out.println("2 - Add Drink");
            System.out.println("3 - Add Chips ($1.50)");
            System.out.println("4 - Get Current Order Total");
            System.out.println("0 - Checkout and Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addSandwich(); // Placeholder for adding a sandwich
                    break;
                case 2:
                    addDrink(order, scanner); // Helper method to add a drink
                    break;
                case 3:
                    addChips(order); // Helper method to add chips
                    break;
                case 4:
                    order.printOrderDetails();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // Placeholder method for adding a sandwich
    private static void addSandwich() {
        throw new UnsupportedOperationException("Adding sandwiches is not yet implemented.");
    }

    // Helper method for adding a drink
    private static void addDrink(Order order, Scanner scanner) {
        while (true) {
            System.out.println("Select Drink Size: 1 - Small, 2 - Medium, 3 - Large");
            int sizeChoice = scanner.nextInt();
            DrinkSize drinkSize;

            if (sizeChoice == 1) {
                drinkSize = DrinkSize.SMALL;
                order.addItem(new Drink(drinkSize));
                System.out.println("Added Small Drink to order.");
                break;
            } else if (sizeChoice == 2) {
                drinkSize = DrinkSize.MEDIUM;
                order.addItem(new Drink(drinkSize));
                System.out.println("Added Medium Drink to order.");
                break;
            } else if (sizeChoice == 3) {
                drinkSize = DrinkSize.LARGE;
                order.addItem(new Drink(drinkSize));
                System.out.println("Added Large Drink to order.");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3 for the drink size.");
            }
        }
    }

    // Helper method for adding chips
    private static void addChips(Order order) {
        order.addItem(new Chips());
        System.out.println("Added Chips to order.");
    }
}