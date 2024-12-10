package com.example.recipe_api_advanced.dto;

import com.example.recipe_api_advanced.entities.Recipe;

public class RecipeDto {
    private Long id;
    private String name;
    private String ingredients;
    private String instructions;
    private NutritionFactsDto nutritionFacts;

    // Static factory method
    public static RecipeDto fromEntity(Recipe recipe) {
        NutritionFactsDto nutritionFactsDTO = null;
        if (recipe.getNutritionFacts() != null) {
            nutritionFactsDTO = NutritionFactsDto.fromEntity(recipe.getNutritionFacts());
        }

        RecipeDto dto = new RecipeDto();
        dto.id = recipe.getId();
        dto.name = recipe.getName();
        dto.ingredients = recipe.getIngredients();
        dto.instructions = recipe.getInstructions();
        dto.nutritionFacts = nutritionFactsDTO;
        return dto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public NutritionFactsDto getNutritionFacts() {
        return nutritionFacts;
    }

    public void setNutritionFacts(NutritionFactsDto nutritionFacts) {
        this.nutritionFacts = nutritionFacts;
    }
}
