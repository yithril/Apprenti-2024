package com.example.mystery_game.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Witness {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String imgUrl;

    private boolean isSuspect;

    @OneToOne
    @JoinColumn(name = "mystery_case_id")
    private MysteryCase mysteryCase;

    @OneToMany(mappedBy = "witness", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WitnessStatement> statements = new ArrayList<>();

    public Witness(){

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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public boolean isSuspect() {
        return isSuspect;
    }

    public void setSuspect(boolean suspect) {
        isSuspect = suspect;
    }

    public MysteryCase getMysteryCase() {
        return mysteryCase;
    }

    public void setMysteryCase(MysteryCase mysteryCase) {
        this.mysteryCase = mysteryCase;
    }

    public List<WitnessStatement> getStatements() {
        return statements;
    }

    public void setStatements(List<WitnessStatement> statements) {
        this.statements = statements;
    }
}
