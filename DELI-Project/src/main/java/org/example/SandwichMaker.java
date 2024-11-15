package org.example;

import java.util.Scanner;

public class SandwichMaker {
    private Scanner scanner;
    private SandwichBuilder builder;

    public SandwichMaker(Scanner scanner) {
        this.scanner = scanner;
    }

    public Sandwich createSandwich() {
        try {
            System.out.println("Select sandwich size: 1 - 4\", 2 - 8\", 3 - 12\"");
            int size = scanner.nextInt();
            builder = new SandwichBuilder(size);

            addBread();
            addMeat();
            addCheese();
            addToppings(IngredientCategory.REGULARTOPPING, "Select regular toppings (enter the index, -1 to stop):");
            addToppings(IngredientCategory.SAUCES, "Select sauces (enter the index, -1 to stop):");
            addToppings(IngredientCategory.SIDES, "Select sides (enter the index, -1 to stop):");
            addExtraMeat();
            addExtraCheese();

            return builder.build();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    private void addBread() {
        System.out.println("Select bread:");
        IngredientLoader.displayIngredientsByCategory(IngredientCategory.BREAD);
        int choice = scanner.nextInt();
        Ingredient bread = IngredientLoader.getIngredientByIndex(IngredientCategory.BREAD, choice);
        builder.addBread(bread);
    }

    private void addMeat() {
        System.out.println("Select meat:");
        IngredientLoader.displayIngredientsByCategory(IngredientCategory.MEAT);
        int choice = scanner.nextInt();
        Ingredient meat = IngredientLoader.getIngredientByIndex(IngredientCategory.MEAT, choice);
        builder.addMeat(meat);
    }

    private void addCheese() {
        System.out.println("Select cheese:");
        IngredientLoader.displayIngredientsByCategory(IngredientCategory.CHEESE);
        int choice = scanner.nextInt();
        Ingredient cheese = IngredientLoader.getIngredientByIndex(IngredientCategory.CHEESE, choice);
        builder.addCheese(cheese);
    }

    private void addToppings(IngredientCategory category, String message) {
        System.out.println(message);
        IngredientLoader.displayIngredientsByCategory(category);

        while (true) {
            System.out.println("Enter the index of the topping to add, or -1 to stop adding toppings:");
            int choice = scanner.nextInt();

            if (choice == -1) {
                break;
            }

            Ingredient topping = IngredientLoader.getIngredientByIndex(category, choice);
            builder.addTopping(topping);
            System.out.println("Added " + topping.getName() + ". You can add another topping or type -1 to finish.");
        }
    }

    private void addExtraMeat() {
        System.out.println("Would you like to add extra meat? (yes/no)");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Select extra meat:");
            IngredientLoader.displayIngredientsByCategory(IngredientCategory.MEAT);
            int extraMeatIndex = scanner.nextInt();
            Ingredient extraMeat = IngredientLoader.getIngredientByIndex(IngredientCategory.MEAT, extraMeatIndex);
            builder.addExtraMeat(extraMeat);
        }
    }

    private void addExtraCheese() {
        System.out.println("Would you like to add extra cheese? (yes/no)");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Select extra cheese:");
            IngredientLoader.displayIngredientsByCategory(IngredientCategory.CHEESE);
            int extraCheeseIndex = scanner.nextInt();
            Ingredient extraCheese = IngredientLoader.getIngredientByIndex(IngredientCategory.CHEESE, extraCheeseIndex);
            builder.addExtraCheese(extraCheese);
        }
    }
}

