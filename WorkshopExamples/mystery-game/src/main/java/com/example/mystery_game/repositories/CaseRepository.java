package com.example.mystery_game.repositories;

import com.example.mystery_game.entities.MysteryCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseRepository extends JpaRepository<MysteryCase, Long> {
}
