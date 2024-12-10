package com.example.recipe_api_advanced.services;

import com.example.recipe_api_advanced.dto.NutritionFactsDto;
import com.example.recipe_api_advanced.entities.NutritionFacts;
import com.example.recipe_api_advanced.entities.Recipe;
import com.example.recipe_api_advanced.repositories.NutritionFactsRepository;
import com.example.recipe_api_advanced.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutritionFactsService {
    @Autowired
    private NutritionFactsRepository nutritionFactsRepository;

    @Autowired
    private RecipeRepository recipeRepository;

    public Recipe addNutritionFactsToRecipe(Long recipeId, NutritionFactsDto dto) {
        // Fetch the Recipe
        Recipe recipe = recipeRepository.findById(recipeId)
                .orElseThrow(() -> new RuntimeException("Recipe not found"));

        // Create NutritionFacts entity from DTO
        NutritionFacts nutritionFacts = new NutritionFacts();
        nutritionFacts.setCalories(dto.getCalories());
        nutritionFacts.setFat(dto.getFat());
        nutritionFacts.setProtein(dto.getProtein());
        nutritionFacts.setCarbs(dto.getCarbs());

        // Associate NutritionFacts with Recipe
        recipe.setNutritionFacts(nutritionFacts);

        // Save the updated Recipe (cascades save to NutritionFacts)
        return recipeRepository.save(recipe);
    }

    // READ (by ID)
    public NutritionFacts getNutritionFactsById(Long id) {
        return nutritionFactsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Nutrition Facts not found"));
    }

    // READ (all)
    public List<NutritionFacts> getAllNutritionFacts() {
        return nutritionFactsRepository.findAll();
    }

    // UPDATE
    public NutritionFacts updateNutritionFacts(Long id, NutritionFactsDto dto) {
        NutritionFacts nutritionFacts = getNutritionFactsById(id); // Reuse get by ID
        nutritionFacts.setCalories(dto.getCalories());
        nutritionFacts.setFat(dto.getFat());
        nutritionFacts.setProtein(dto.getProtein());
        nutritionFacts.setCarbs(dto.getCarbs());
        return nutritionFactsRepository.save(nutritionFacts);
    }

    // DELETE
    public void deleteNutritionFacts(Long id) {
        NutritionFacts nutritionFacts = getNutritionFactsById(id);
        nutritionFactsRepository.delete(nutritionFacts);
    }
}
