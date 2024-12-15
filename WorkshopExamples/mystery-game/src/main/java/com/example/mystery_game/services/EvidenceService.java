package com.example.mystery_game.services;

import com.example.mystery_game.dto.evidence.CreateUpdateEvidenceDto;
import com.example.mystery_game.dto.evidence.EvidenceDto;
import com.example.mystery_game.entities.MysteryCase;
import com.example.mystery_game.entities.Evidence;
import com.example.mystery_game.repositories.CaseRepository;
import com.example.mystery_game.repositories.EvidenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvidenceService {

    @Autowired
    private EvidenceRepository evidenceRepository;

    @Autowired
    private CaseRepository caseRepository;

    // Create new evidence for a case
    public EvidenceDto createEvidence(Long caseId, CreateUpdateEvidenceDto evidenceDto) {
        MysteryCase mysteryCase = caseRepository.findById(caseId)
                .orElseThrow(() -> new IllegalArgumentException("Case not found with id: " + caseId));

        Evidence evidence = fromCreate(evidenceDto);
        evidence.setMysteryCase(mysteryCase);
        Evidence savedEvidence = evidenceRepository.save(evidence);

        return toDto(savedEvidence);
    }

    // Get evidence by ID
    public EvidenceDto getEvidenceById(Long id) {
        Evidence evidence = evidenceRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Evidence not found with id: " + id));
        return toDto(evidence);
    }

    // Get all evidence for a specific case
    public List<EvidenceDto> getEvidenceByCaseId(Long caseId) {
        if (!caseRepository.existsById(caseId)) {
            throw new IllegalArgumentException("Case not found with id: " + caseId);
        }

        return evidenceRepository.findByMysteryCaseId(caseId).stream()
                .map(this::toDto)
                .toList();
    }

    // Update evidence
    public EvidenceDto updateEvidence(Long id, EvidenceDto evidenceDto) {
        Evidence evidence = evidenceRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Evidence not found with id: " + id));

        evidence.setName(evidenceDto.getName());
        evidence.setDescription(evidenceDto.getDescription());
        evidence.setImgUrl(evidenceDto.getImgUrl());

        Evidence updatedEvidence = evidenceRepository.save(evidence);
        return toDto(updatedEvidence);
    }

    // Delete evidence
    public void deleteEvidence(Long id) {
        if (!evidenceRepository.existsById(id)) {
            throw new IllegalArgumentException("Evidence not found with id: " + id);
        }
        evidenceRepository.deleteById(id);
    }

    // Helper method to convert Evidence entity to EvidenceDto
    private EvidenceDto toDto(Evidence evidence) {
        return new EvidenceDto(
                evidence.getId(),
                evidence.getName(),
                evidence.getDescription(),
                evidence.getImgUrl()
        );
    }

    private Evidence fromCreate(CreateUpdateEvidenceDto dto){
        Evidence evidence = new Evidence();
        evidence.setName(dto.getName());
        evidence.setDescription(dto.getDescription());
        evidence.setImgUrl(dto.getImgUrl());
        return evidence;
    }

    // Helper method to convert EvidenceDto to Evidence entity
    private Evidence toEntity(EvidenceDto dto) {
        Evidence evidence = new Evidence();
        evidence.setName(dto.getName());
        evidence.setDescription(dto.getDescription());
        evidence.setImgUrl(dto.getImgUrl());
        return evidence;
    }
}
