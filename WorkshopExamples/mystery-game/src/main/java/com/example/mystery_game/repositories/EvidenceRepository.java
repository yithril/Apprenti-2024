package com.example.mystery_game.repositories;

import com.example.mystery_game.entities.Evidence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvidenceRepository extends JpaRepository<Evidence, Long> {
    List<Evidence> findByMysteryCaseId(Long caseId);
}
