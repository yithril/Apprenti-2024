package com.example.mystery_game.dto.mysteryCase;

public class CreateUpdateCaseDto {
    private String name;

    private String description;

    private String caseDate;

    public CreateUpdateCaseDto(String name, String description, String caseDate) {
        this.name = name;
        this.description = description;
        this.caseDate = caseDate;
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
}
