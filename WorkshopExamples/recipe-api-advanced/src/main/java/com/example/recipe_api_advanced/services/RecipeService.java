package com.example.recipe_api_advanced.services;

import com.example.recipe_api_advanced.dto.CreateUpdateRecipeDto;
import com.example.recipe_api_advanced.dto.RecipeDto;
import com.example.recipe_api_advanced.entities.Recipe;
import com.example.recipe_api_advanced.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<RecipeDto> getAllRecipes() {
        List<Recipe> recipes = recipeRepository.findAll();
        return convertToDTOList(recipes);
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
