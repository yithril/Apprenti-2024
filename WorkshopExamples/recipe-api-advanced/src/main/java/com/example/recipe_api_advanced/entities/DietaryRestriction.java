package com.example.recipe_api_advanced.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class DietaryRestriction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name; // e.g., "Vegan", "Gluten-Free", "Dairy-Free"

    @CreatedDate
    private LocalDateTime createdDate;

    //This is one of the auditing fields
    @LastModifiedDate
    private LocalDateTime lastModified;

    @ManyToMany(mappedBy = "dietaryRestrictions")
    private Set<Recipe> recipes = new HashSet<>();

    //Remember you need a no args constructor
    public DietaryRestriction(){

    }

    public DietaryRestriction(Long id, String name) {
        this.id = id;
        this.name = name;
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

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }
}
