package com.example.mystery_game.dto.evidence;

public class CreateUpdateEvidenceDto {
    private String name;
    private String description;
    private String imgUrl;
    private Long caseId;

    public CreateUpdateEvidenceDto(String name, String description, String imgUrl, Long caseId) {
        this.name = name;
        this.description = description;
        this.imgUrl = imgUrl;
        this.caseId = caseId;
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Long getCaseId() {
        return caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }
}
