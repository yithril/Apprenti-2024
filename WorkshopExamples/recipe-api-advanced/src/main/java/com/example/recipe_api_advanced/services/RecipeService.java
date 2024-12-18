package com.example.recipe_api_advanced.services;

import com.example.recipe_api_advanced.dto.CreateUpdateRecipeDto;
import com.example.recipe_api_advanced.dto.NutritionFactsDto;
import com.example.recipe_api_advanced.dto.RecipeDto;
import com.example.recipe_api_advanced.entities.Recipe;
import com.example.recipe_api_advanced.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    //The elegant way with a helper method
    public List<RecipeDto> getAllRecipes() {
        List<Recipe> recipes = recipeRepository.findAll();
        return convertToDTOList(recipes);
    }

    //The inelegant way
    public List<RecipeDto> getAllRecipesInelegant() {
        // Fetch all recipes from the repository
        List<Recipe> recipes = recipeRepository.findAll();

        // Create an empty list to hold RecipeDto objects
        List<RecipeDto> recipeDtos = new ArrayList<>();

        // Loop through each Recipe, manually set fields to the DTO, and add to the list
        for (Recipe recipe : recipes) {
            RecipeDto dto = new RecipeDto();
            dto.setId(recipe.getId());
            dto.setName(recipe.getName());
            dto.setIngredients(recipe.getIngredients());
            dto.setInstructions(recipe.getInstructions());

            if (recipe.getNutritionFacts() != null) {
                NutritionFactsDto nutritionDto = new NutritionFactsDto();
                nutritionDto.setCalories(recipe.getNutritionFacts().getCalories());
                nutritionDto.setFat(recipe.getNutritionFacts().getFat());
                nutritionDto.setProtein(recipe.getNutritionFacts().getProtein());
                nutritionDto.setCarbs(recipe.getNutritionFacts().getCarbs());
                dto.setNutritionFacts(nutritionDto);
            } else {
                dto.setNutritionFacts(null);
            }

            recipeDtos.add(dto);
        }

        // Return the list of RecipeDto objects
        return recipeDtos;
    }


    public RecipeDto getRecipeById(Long id) {
        Recipe recipe = recipeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Recipe not found"));
        return RecipeDto.fromEntity(recipe);
    }

    public RecipeDto createRecipe(CreateUpdateRecipeDto createRecipeDto) {
        Recipe recipe = new Recipe();
        recipe.setName(createRecipeDto.getName());
        recipe.setIngredients(createRecipeDto.getIngredients());
        recipe.setInstructions(createRecipeDto.getInstructions());
        recipe.setRecipeImage(createRecipeDto.getRecipeImage());

        Recipe savedRecipe = recipeRepository.save(recipe);
        return RecipeDto.fromEntity(savedRecipe);
    }

    public RecipeDto updateRecipe(Long id, CreateUpdateRecipeDto recipeDto) {
        Recipe recipe = recipeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Recipe not found"));

        recipe.setName(recipeDto.getName());
        recipe.setIngredients(recipeDto.getIngredients());
        recipe.setInstructions(recipeDto.getInstructions());

        Recipe updatedRecipe = recipeRepository.save(recipe);
        return RecipeDto.fromEntity(updatedRecipe);
    }

    public void deleteRecipe(Long id) {
        Recipe recipe = recipeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Recipe not found"));
        recipeRepository.delete(recipe);
    }

    private List<RecipeDto> convertToDTOList(List<Recipe> recipes) {
        return recipes.stream()
                .map(RecipeDto::fromEntity)
                .toList();
    }
}
