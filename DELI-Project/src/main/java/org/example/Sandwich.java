package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements MenuItem {
    private List<Ingredient> ingredients = new ArrayList<>();
    private int size; // 1 = 4", 2 = 8", 3 = 12"

    public Sandwich(int size) {
        this.size = size;
    }

    // Method to add an ingredient to the sandwich
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    // Method to calculate the total cost of the sandwich
    @Override
    public double getCost() {
        double totalCost = 0.0;
        boolean hasBread = false;

        // Calculate cost of bread and ensure there's at least one bread ingredient
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getCategory() == IngredientCategory.BREAD) {
                totalCost += ingredient.getCost(size);
                hasBread = true;
            } else {
                totalCost += ingredient.getCost(size);
            }
        }

        if (!hasBread) {
            throw new IllegalStateException("A sandwich must have at least one bread.");
        }

        return totalCost;
    }

    @Override
    public String getDescription() {
        String description = "Sandwich (Size: " + (size == 1 ? "4\"" : size == 2 ? "8\"" : "12\"") + ") with ";
        for (int i = 0; i < ingredients.size(); i++) {
            description += ingredients.get(i).getName();
            if (i < ingredients.size() - 1) {
                description += ", ";
            }
        }
        return description;
    }
}
