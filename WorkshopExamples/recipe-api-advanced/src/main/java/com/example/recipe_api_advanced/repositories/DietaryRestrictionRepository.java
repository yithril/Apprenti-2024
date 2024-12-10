package com.example.recipe_api_advanced.repositories;

import com.example.recipe_api_advanced.entities.DietaryRestriction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DietaryRestrictionRepository extends JpaRepository<DietaryRestriction, Long> {
}
