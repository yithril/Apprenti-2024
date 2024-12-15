package com.example.mystery_game.services;

import com.example.mystery_game.dto.mysteryCase.CaseDto;
import com.example.mystery_game.dto.mysteryCase.CreateUpdateCaseDto;
import com.example.mystery_game.dto.evidence.EvidenceDto;
import com.example.mystery_game.entities.MysteryCase;
import com.example.mystery_game.repositories.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseService {

    @Autowired
    private CaseRepository caseRepository;

    // Create a new case
    //Notice how this function takes in the create dto and returns
    //the regular dto?
    public CaseDto createCase(CreateUpdateCaseDto dto) {
        MysteryCase mysteryCase = toEntity(dto);
        MysteryCase savedCase = caseRepository.save(mysteryCase);
        return toDto(savedCase);
    }

    // Get a case by ID
    public CaseDto getCaseById(Long id) {
        MysteryCase mysteryCase = caseRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Case not found with id: " + id));
        return toDto(mysteryCase);
    }

    // Get all cases
    public List<CaseDto> getAllCases() {
        return caseRepository.findAll().stream()
                .map(this::toDto)
                .toList();
    }

    // Update a case
    public CaseDto updateCase(Long id, CreateUpdateCaseDto dto) {
        MysteryCase mysteryCase = caseRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Case not found with id: " + id));

        mysteryCase.setName(dto.getName());
        mysteryCase.setDescription(dto.getDescription());
        mysteryCase.setCaseDate(dto.getCaseDate());

        MysteryCase updatedCase = caseRepository.save(mysteryCase);
        return toDto(updatedCase);
    }

    // Delete a case
    public void deleteCase(Long id) {
        if (!caseRepository.existsById(id)) {
            throw new IllegalArgumentException("Case not found with id: " + id);
        }
        caseRepository.deleteById(id);
    }

    // Helper method to convert Case to CaseDto
    private CaseDto toDto(MysteryCase mysteryCase) {
        return new CaseDto(
                mysteryCase.getId(),
                mysteryCase.getName(),
                mysteryCase.getDescription(),
                mysteryCase.getCaseDate(),
                mysteryCase.getEvidenceList().stream()
                        .map(e -> new EvidenceDto(e.getId(), e.getName(), e.getDescription(), e.getImgUrl()))
                        .toList()
        );
    }

    // Helper method to convert CreateUpdateCaseDto to Case
    private MysteryCase toEntity(CreateUpdateCaseDto dto) {
        MysteryCase mysteryCase = new MysteryCase();
        mysteryCase.setName(dto.getName());
        mysteryCase.setDescription(dto.getDescription());
        mysteryCase.setCaseDate(dto.getCaseDate());
        return mysteryCase;
    }
}
