package org.example;

import java.util.Scanner;

public class UserInterface {
    private Order order;
    private Scanner scanner;

    public UserInterface(){
        order = new Order();
        scanner = new Scanner(System.in);
    }

    // Method to start the user interface
    public void start() {
        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1 - Add Sandwich");
            System.out.println("2 - Add Drink");
            System.out.println("3 - Add Chips ($1.50)");
            System.out.println("4 - Get Current Order Total");
            System.out.println("0 - Checkout and Exit");

            int choice = scanner.nextInt();

            if (choice == 0) {
                order.printOrderDetails();
                break;
            }

            switch (choice) {
                case 1:
                    addSandwich();
                    break;
                case 2:
                    addDrink();
                    break;
                case 3:
                    addChips();
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
    private void addSandwich() {
        SandwichMaker sandwichMaker = new SandwichMaker(scanner);
        Sandwich sandwich = sandwichMaker.createSandwich();
        if (sandwich != null) {
            order.addItem(sandwich);
            System.out.println("Added Sandwich to order.");
        }
    }

    // Helper method for adding a drink
    private void addDrink() {
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
    private void addChips() {
        order.addItem(new Chips());
        System.out.println("Added Chips to order.");
    }
}
