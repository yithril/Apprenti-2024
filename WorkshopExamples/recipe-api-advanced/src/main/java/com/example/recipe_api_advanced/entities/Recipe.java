package com.example.recipe_api_advanced.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @NotBlank(message = "Ingredients is mandatory")
    private String ingredients;

    @NotBlank(message = "Instructions is mandatory")
    private String instructions;

    private boolean isVegan;

    //EAGER fetching means you want the database to load the recipe
    //AND the nutrition facts at the same time.
    //The default is lazy loading, meaning you'll ask for the other entity
    //if you want it
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "nutrition_facts_id")
    private NutritionFacts nutritionFacts;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private Set<Review> reviews = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "recipe_dietary_restriction",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "dietary_restriction_id")
    )
    private Set<DietaryRestriction> dietaryRestrictions = new HashSet<>();

    //This is one of the auditing fields
    @CreatedDate
    private LocalDateTime createdDate;

    //This is one of the auditing fields
    @LastModifiedDate
    private LocalDateTime lastModified;

    //You must have a constructor without parameters
    public Recipe(){

    }

    public Recipe(Long id, String name, String ingredients, String instructions, boolean isVegan, NutritionFacts nutritionFacts, Set<Review> reviews, Set<DietaryRestriction> dietaryRestrictions) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.isVegan = isVegan;
        this.nutritionFacts = nutritionFacts;
        this.reviews = reviews;
        this.dietaryRestrictions = dietaryRestrictions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Name is mandatory") @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name is mandatory") @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Ingredients is mandatory") String getIngredients() {
        return ingredients;
    }

    public void setIngredients(@NotBlank(message = "Ingredients is mandatory") String ingredients) {
        this.ingredients = ingredients;
    }

    public @NotBlank(message = "Instructions is mandatory") String getInstructions() {
        return instructions;
    }

    public void setInstructions(@NotBlank(message = "Instructions is mandatory") String instructions) {
        this.instructions = instructions;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public NutritionFacts getNutritionFacts() {
        return nutritionFacts;
    }

    public void setNutritionFacts(NutritionFacts nutritionFacts) {
        this.nutritionFacts = nutritionFacts;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }

    public Set<DietaryRestriction> getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    public void setDietaryRestrictions(Set<DietaryRestriction> dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDated) {
        this.createdDate = createdDated;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }
}
