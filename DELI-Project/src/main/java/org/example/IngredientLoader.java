package org.example;

import java.util.ArrayList;
import java.util.List;

public class IngredientLoader {
    private static List<Ingredient> ingredients = new ArrayList<>();

    static {
        // Bread
        ingredients.add(new Ingredient("White", IngredientCategory.BREAD, false, 5.50));
        ingredients.add(new Ingredient("Wheat", IngredientCategory.BREAD, false, 5.50));
        ingredients.add(new Ingredient("Rye", IngredientCategory.BREAD, false, 5.50));
        ingredients.add(new Ingredient("Wrap", IngredientCategory.BREAD, false, 5.50));

        // Meats
        ingredients.add(new Ingredient("Steak", IngredientCategory.MEAT, false, 1.00));
        ingredients.add(new Ingredient("Ham", IngredientCategory.MEAT, false, 1.00));
        ingredients.add(new Ingredient("Salami", IngredientCategory.MEAT, false, 1.00));
        ingredients.add(new Ingredient("Roast Beef", IngredientCategory.MEAT, false, 1.00));
        ingredients.add(new Ingredient("Chicken", IngredientCategory.MEAT, false, 1.00));
        ingredients.add(new Ingredient("Bacon", IngredientCategory.MEAT, false, 1.00));

        // Cheese
        ingredients.add(new Ingredient("American", IngredientCategory.CHEESE, false, 0.75));
        ingredients.add(new Ingredient("Provolone", IngredientCategory.CHEESE, false, 0.75));
        ingredients.add(new Ingredient("Cheddar", IngredientCategory.CHEESE, false, 0.75));
        ingredients.add(new Ingredient("Swiss", IngredientCategory.CHEESE, false, 0.75));

        // Regular Toppings (included)
        ingredients.add(new Ingredient("Lettuce", IngredientCategory.REGULARTOPPING, true, 0.0));
        ingredients.add(new Ingredient("Peppers", IngredientCategory.REGULARTOPPING, true, 0.0));
        ingredients.add(new Ingredient("Onions", IngredientCategory.REGULARTOPPING, true, 0.0));
        ingredients.add(new Ingredient("Tomatoes", IngredientCategory.REGULARTOPPING, true, 0.0));
        ingredients.add(new Ingredient("Jalepenos", IngredientCategory.REGULARTOPPING, true, 0.0));
        ingredients.add(new Ingredient("Cucumbers", IngredientCategory.REGULARTOPPING, true, 0.0));
        ingredients.add(new Ingredient("Pickles", IngredientCategory.REGULARTOPPING, true, 0.0));
        ingredients.add(new Ingredient("Guacamole", IngredientCategory.REGULARTOPPING, true, 0.0));
        ingredients.add(new Ingredient("Mushrooms", IngredientCategory.REGULARTOPPING, true, 0.0));

        // Sauces (included)
        ingredients.add(new Ingredient("Mayo", IngredientCategory.SAUCES, true, 0.0));
        ingredients.add(new Ingredient("Mustard", IngredientCategory.SAUCES, true, 0.0));
        ingredients.add(new Ingredient("Ketchup", IngredientCategory.SAUCES, true, 0.0));
        ingredients.add(new Ingredient("Ranch", IngredientCategory.SAUCES, true, 0.0));
        ingredients.add(new Ingredient("Thousand Islands", IngredientCategory.SAUCES, true, 0.0));
        ingredients.add(new Ingredient("Vinaigrette", IngredientCategory.SAUCES, true, 0.0));

        // Sides (included)
        ingredients.add(new Ingredient("Au Jus", IngredientCategory.SIDES, true, 0.0));
        ingredients.add(new Ingredient("Sauce", IngredientCategory.SIDES, true, 0.0));
    }

    public static Ingredient getIngredientByIndex(IngredientCategory category, int index) {
        List<Ingredient> filteredIngredients = new ArrayList<>();
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getCategory() == category) {
                filteredIngredients.add(ingredient);
            }
        }

        if (index < 0 || index >= filteredIngredients.size()) {
            throw new IllegalArgumentException("Invalid index. Please select a valid ingredient number.");
        }

        return filteredIngredients.get(index);
    }

    public static void displayIngredientsByCategory(IngredientCategory category) {
        System.out.println("Ingredients in category: " + category);
        int index = 0;
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getCategory() == category) {
                if (ingredient.isIncluded()) {
                    System.out.printf("%d. %s - Included%n", index, ingredient.getName());
                } else {
                    System.out.printf("%d. %s - Base Cost: $%.2f%n", index, ingredient.getName(), ingredient.getCost(1));
                }
                index++;
            }
        }
    }

}
