package com.example.mystery_game.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Solution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private MysteryCase mysteryCase;

    @ManyToMany
    @JoinTable(
            name = "solution_evidence",
            joinColumns = @JoinColumn(name = "solution_id"),
            inverseJoinColumns = @JoinColumn(name = "evidence_id")
    )
    private List<Evidence> evidenceList = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "solution_witness",
            joinColumns = @JoinColumn(name = "solution_id"),
            inverseJoinColumns = @JoinColumn(name = "witness_id")
    )
    private List<Witness> witnessList = new ArrayList<>();

    public Solution(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MysteryCase getMysteryCase() {
        return mysteryCase;
    }

    public void setMysteryCase(MysteryCase mysteryCase) {
        this.mysteryCase = mysteryCase;
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
}
