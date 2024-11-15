package org.example;

public class SandwichBuilder {
    private Sandwich sandwich;
    private boolean hasBread = false;
    private boolean hasMeat = false;
    private boolean hasCheese = false;

    public SandwichBuilder(int size) {
        if (size < 1 || size > 3) {
            throw new IllegalArgumentException("Invalid sandwich size. Size must be 1 (4\"), 2 (8\"), or 3 (12\").");
        }
        sandwich = new Sandwich(size);
    }

    // Method to add bread
    public SandwichBuilder addBread(Ingredient bread) {
        if (bread.getCategory() != IngredientCategory.BREAD) {
            throw new IllegalArgumentException("Invalid ingredient: Bread is required to be of BREAD category.");
        }
        sandwich.addIngredient(bread);
        hasBread = true;
        return this;
    }

    // Method to add meat
    public SandwichBuilder addMeat(Ingredient meat) {
        if (meat.getCategory() != IngredientCategory.MEAT) {
            throw new IllegalArgumentException("Invalid ingredient: Meat is required to be of MEAT category.");
        }
        sandwich.addIngredient(meat);
        hasMeat = true;
        return this;
    }

    // Method to add cheese
    public SandwichBuilder addCheese(Ingredient cheese) {
        if (cheese.getCategory() != IngredientCategory.CHEESE) {
            throw new IllegalArgumentException("Invalid ingredient: Cheese is required to be of CHEESE category.");
        }
        sandwich.addIngredient(cheese);
        hasCheese = true;
        return this;
    }

    // Method to add regular toppings
    public SandwichBuilder addTopping(Ingredient topping) {
        if (topping.getCategory() != IngredientCategory.REGULARTOPPING
                && topping.getCategory() != IngredientCategory.SAUCES
                && topping.getCategory() != IngredientCategory.SIDES) {
            throw new IllegalArgumentException("Invalid ingredient: Topping must be a REGULAR TOPPING, SAUCES, or SIDES category.");
        }
        sandwich.addIngredient(topping);
        return this;
    }

    // Method to add extra meat (must already have regular meat)
    public SandwichBuilder addExtraMeat(Ingredient extraMeat) {
        if (!hasMeat) {
            throw new IllegalStateException("Cannot add extra meat without regular meat already on the sandwich.");
        }
        if (extraMeat.getCategory() != IngredientCategory.MEAT) {
            throw new IllegalArgumentException("Invalid ingredient: Extra meat must be of MEAT category.");
        }
        sandwich.addIngredient(extraMeat);
        return this;
    }

    // Method to add extra cheese (must already have regular cheese)
    public SandwichBuilder addExtraCheese(Ingredient extraCheese) {
        if (!hasCheese) {
            throw new IllegalStateException("Cannot add extra cheese without regular cheese already on the sandwich.");
        }
        if (extraCheese.getCategory() != IngredientCategory.CHEESE) {
            throw new IllegalArgumentException("Invalid ingredient: Extra cheese must be of CHEESE category.");
        }
        sandwich.addIngredient(extraCheese);
        return this;
    }

    // Method to build the sandwich (ensures bread is present)
    public Sandwich build() {
        if (!hasBread) {
            throw new IllegalStateException("A sandwich must have at least one type of bread.");
        }
        return sandwich;
    }
}
