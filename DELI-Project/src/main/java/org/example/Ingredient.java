package org.example;

public class Ingredient {
    private String name;
    private IngredientCategory category;
    private boolean isIncluded;
    private double baseCost; // Cost for the smallest sandwich size (e.g., 4")

    public Ingredient(String name, IngredientCategory category, boolean isIncluded, double baseCost) {
        this.name = name;
        this.category = category;
        this.isIncluded = isIncluded;
        this.baseCost = baseCost;
    }

    public String getName() {
        return name;
    }

    public IngredientCategory getCategory() {
        return category;
    }

    public boolean isIncluded() {
        return isIncluded;
    }

    public double getCost(int size) {
        // Special handling for bread pricing
        if (category == IngredientCategory.BREAD) {
            return switch (size) {
                case 1 -> 5.50;
                case 2 -> 7.00;
                case 3 -> 8.50;
                default -> throw new IllegalArgumentException("Invalid size: " + size);
            };
        }

        // General cost calculation for other ingredients
        if (isIncluded) {
            return 0.0;
        }
        return switch (size) {
            case 1 -> baseCost;
            case 2 -> baseCost * 2;
            case 3 -> baseCost * 3;
            default -> throw new IllegalArgumentException("Invalid size: " + size);
        };
    }
}

