package com.example.recipe_api_advanced.controllers;

import com.example.recipe_api_advanced.dto.CreateUpdateRecipeDto;
import com.example.recipe_api_advanced.dto.NutritionFactsDto;
import com.example.recipe_api_advanced.dto.RecipeDto;
import com.example.recipe_api_advanced.entities.Recipe;
import com.example.recipe_api_advanced.services.NutritionFactsService;
import com.example.recipe_api_advanced.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @Autowired
    private NutritionFactsService nutritionFactsService;

    @GetMapping
    public List<RecipeDto> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @GetMapping("/{id}")
    public RecipeDto getRecipeById(@PathVariable Long id) {
        return recipeService.getRecipeById(id);
    }

    @PostMapping
    public ResponseEntity<RecipeDto> createRecipe(@RequestBody CreateUpdateRecipeDto createRecipeDto) {
        RecipeDto createdRecipe = recipeService.createRecipe(createRecipeDto);
        return ResponseEntity.ok(createdRecipe);
    }

    // PUT: Update an existing recipe
    @PutMapping("/{id}")
    public ResponseEntity<RecipeDto> updateRecipe(
            @PathVariable Long id,
            @RequestBody CreateUpdateRecipeDto recipeDto) {
        RecipeDto updatedRecipe = recipeService.updateRecipe(id, recipeDto);
        return ResponseEntity.ok(updatedRecipe);
    }

    // DELETE: Delete a recipe
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecipe(@PathVariable Long id) {
        recipeService.deleteRecipe(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{recipeId}/nutritionFacts")
    public ResponseEntity<RecipeDto> addNutritionFactsToRecipe(
            @PathVariable Long recipeId,
            @RequestBody NutritionFactsDto nutritionFactsDTO) {
        // Delegate to service to add NutritionFacts
        Recipe updatedRecipe = nutritionFactsService.addNutritionFactsToRecipe(recipeId, nutritionFactsDTO);
        // Convert the updated Recipe to DTO and return
        return ResponseEntity.ok(RecipeDto.fromEntity(updatedRecipe));
    }
}
