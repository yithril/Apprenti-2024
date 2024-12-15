package com.example.mystery_game.controllers;

import com.example.mystery_game.dto.evidence.CreateUpdateEvidenceDto;
import com.example.mystery_game.dto.evidence.EvidenceDto;
import com.example.mystery_game.services.EvidenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evidence")
public class EvidenceController {

    @Autowired
    private EvidenceService evidenceService;

    // Create new evidence for a case
    //notice how the case id is part of the path!
    @PostMapping("/case/{caseId}")
    public ResponseEntity<EvidenceDto> createEvidence(
            @PathVariable Long caseId,
            @RequestBody CreateUpdateEvidenceDto evidenceDto
    ) {
        EvidenceDto createdEvidence = evidenceService.createEvidence(caseId, evidenceDto);
        return ResponseEntity.ok(createdEvidence);
    }

    // Get evidence by ID
    @GetMapping("/{id}")
    public ResponseEntity<EvidenceDto> getEvidenceById(@PathVariable Long id) {
        EvidenceDto evidence = evidenceService.getEvidenceById(id);
        return ResponseEntity.ok(evidence);
    }

    // Get all evidence for a specific case
    @GetMapping("/case/{caseId}")
    public ResponseEntity<List<EvidenceDto>> getEvidenceByCaseId(@PathVariable Long caseId) {
        List<EvidenceDto> evidenceList = evidenceService.getEvidenceByCaseId(caseId);
        return ResponseEntity.ok(evidenceList);
    }

    // Update evidence by ID
    @PutMapping("/{id}")
    public ResponseEntity<EvidenceDto> updateEvidence(
            @PathVariable Long id,
            @RequestBody EvidenceDto evidenceDto
    ) {
        EvidenceDto updatedEvidence = evidenceService.updateEvidence(id, evidenceDto);
        return ResponseEntity.ok(updatedEvidence);
    }

    // Delete evidence by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvidence(@PathVariable Long id) {
        evidenceService.deleteEvidence(id);
        return ResponseEntity.noContent().build();
    }
}
