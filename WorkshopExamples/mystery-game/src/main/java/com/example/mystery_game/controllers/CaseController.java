package com.example.mystery_game.controllers;

import com.example.mystery_game.dto.mysteryCase.CaseDto;
import com.example.mystery_game.dto.mysteryCase.CreateUpdateCaseDto;
import com.example.mystery_game.services.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cases")
public class CaseController {

    @Autowired
    private CaseService caseService;

    // Create a new case
    //See how we're using the creation dto here and returning the casedto here?
    @PostMapping
    public ResponseEntity<CaseDto> createCase(@RequestBody CreateUpdateCaseDto createCaseDto) {
        CaseDto caseDto = caseService.createCase(createCaseDto);
        return ResponseEntity.ok(caseDto);
    }

    // Get all cases
    @GetMapping
    public ResponseEntity<List<CaseDto>> getAllCases() {
        List<CaseDto> cases = caseService.getAllCases();
        return ResponseEntity.ok(cases);
    }

    // Get a specific case by ID
    @GetMapping("/{id}")
    public ResponseEntity<CaseDto> getCaseById(@PathVariable Long id) {
        CaseDto caseDto = caseService.getCaseById(id);
        return ResponseEntity.ok(caseDto);
    }

    // Update an existing case
    @PutMapping("/{id}")
    public ResponseEntity<CaseDto> updateCase(
            @PathVariable Long id,
            @RequestBody CreateUpdateCaseDto updateCaseDto
    ) {
        CaseDto updatedCase = caseService.updateCase(id, updateCaseDto);
        return ResponseEntity.ok(updatedCase);
    }

    // Delete a case
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCase(@PathVariable Long id) {
        caseService.deleteCase(id);
        return ResponseEntity.noContent().build();
    }
}
