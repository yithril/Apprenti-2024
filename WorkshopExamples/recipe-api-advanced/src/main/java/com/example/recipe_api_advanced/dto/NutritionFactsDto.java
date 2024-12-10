package com.example.recipe_api_advanced.dto;

import com.example.recipe_api_advanced.entities.NutritionFacts;

public class NutritionFactsDto {
    private int calories;
    private int fat;
    private int protein;
    private int carbs;

    // Static factory method
    public static NutritionFactsDto fromEntity(NutritionFacts nutritionFacts) {
        NutritionFactsDto dto = new NutritionFactsDto();
        dto.calories = nutritionFacts.getCalories();
        dto.fat = nutritionFacts.getFat();
        dto.protein = nutritionFacts.getProtein();
        dto.carbs = nutritionFacts.getCarbs();
        return dto;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }
}
