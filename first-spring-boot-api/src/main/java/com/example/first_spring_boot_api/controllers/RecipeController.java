package com.example.first_spring_boot_api.controllers;

import com.example.first_spring_boot_api.entities.Recipe;
import com.example.first_spring_boot_api.repositories.RecipeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/recipe")
public class RecipeController {

    //Dependency injection
    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping
    public List<Recipe> getAllRecipes(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String ingredients){

        if(name != null && ingredients != null){
            return recipeRepository.findByIngredientsContainingAndNameContaining(ingredients, name);
        }

        if(name != null){
            return recipeRepository.findByNameContaining(name);
        }

        var recipes = recipeRepository.findAll();
        return recipes;
    }

    @PostMapping
    public ResponseEntity<Recipe> createRecipe(@RequestBody @Valid Recipe recipe){
        var newRecipe = recipeRepository.save(recipe);

        return new ResponseEntity<>(newRecipe, HttpStatus.CREATED);
    }

    //Get a recipe by its id
    // /api/recipe/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Recipe> getRecipeById(@PathVariable Long id){
        //search for a recipe with a specific id
        Optional<Recipe> recipe = recipeRepository.findById(id);

        //If we found the recipe we give back a 200
        //If we didn't find the recipe we give back a 404 not found
        if(recipe.isPresent()){
            return new ResponseEntity<>(recipe.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecipe(@PathVariable Long id){
        Optional<Recipe> recipe = recipeRepository.findById(id);

        if(recipe.isPresent()){
            recipeRepository.delete(recipe.get());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Recipe> updateRecipe(@PathVariable Long id, @RequestBody @Valid Recipe recipe){
        Optional<Recipe> existingRecipe = recipeRepository.findById(id);

        if(existingRecipe.isPresent()){
            Recipe recipeToUpdate = existingRecipe.get();

            recipeToUpdate.setName(recipe.getName());
            recipeToUpdate.setIngredients(recipe.getIngredients());
            recipeToUpdate.setInstructions(recipe.getInstructions());
            recipeToUpdate.setVegan(recipe.isVegan());

            Recipe updatedRecipe = recipeRepository.save(recipeToUpdate);

            return new ResponseEntity<>(updatedRecipe, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
