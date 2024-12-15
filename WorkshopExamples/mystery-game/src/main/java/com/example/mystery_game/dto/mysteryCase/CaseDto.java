package com.example.mystery_game.dto.mysteryCase;

import com.example.mystery_game.dto.evidence.EvidenceDto;

import java.util.List;

public class CaseDto {
    private Long id;
    private String name;

    private String description;

    private String caseDate;
    private List<EvidenceDto> evidenceList;

    public CaseDto(Long id, String name, String description, String caseDate, List<EvidenceDto> evidenceList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.caseDate = caseDate;
        this.evidenceList = evidenceList;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCaseDate() {
        return caseDate;
    }

    public void setCaseDate(String caseDate) {
        this.caseDate = caseDate;
    }

    public List<EvidenceDto> getEvidenceList() {
        return evidenceList;
    }

    public void setEvidenceList(List<EvidenceDto> evidenceList) {
        this.evidenceList = evidenceList;
    }
}
