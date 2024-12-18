package com.example.first_spring_boot_api.repositories;

import com.example.first_spring_boot_api.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//Spring Data JPA
//ORM Object Relational Mapper
@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findByNameContaining(String name);
    List<Recipe> findByIngredientsContainingAndNameContaining(String ingredients, String name);
}
