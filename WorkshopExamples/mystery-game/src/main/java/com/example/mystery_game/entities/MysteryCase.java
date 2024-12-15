package com.example.mystery_game.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class MysteryCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    private String description;

    private String caseDate;

    @OneToMany(mappedBy = "mysteryCase", cascade = CascadeType.ALL)
    private List<Evidence> evidenceList = new ArrayList<>();

    @OneToMany(mappedBy = "mysteryCase", cascade = CascadeType.ALL)
    private List<Witness> witnessList = new ArrayList<>();

    @OneToOne(mappedBy = "mysteryCase", cascade = CascadeType.ALL)
    private Solution solution;

    public MysteryCase(){

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public List<Evidence> getEvidenceList() {
        return evidenceList;
    }

    public void setEvidenceList(List<Evidence> evidenceList) {
        this.evidenceList = evidenceList;
    }

    public List<Witness> getWitnessList() {
        return witnessList;
    }

    public void setWitnessList(List<Witness> witnessList) {
        this.witnessList = witnessList;
    }

    public Solution getSolution() {
        return solution;
    }

    public void setSolution(Solution solution) {
        this.solution = solution;
    }
}
