package com.example.recipe_api_advanced.repositories;

import com.example.recipe_api_advanced.entities.NutritionFacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutritionFactsRepository extends JpaRepository<NutritionFacts, Long> {
}
