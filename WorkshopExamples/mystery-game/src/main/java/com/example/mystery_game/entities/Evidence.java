package com.example.mystery_game.entities;

import jakarta.persistence.*;

@Entity
public class Evidence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;
    private String imgUrl;

    //The reason I'm not naming the variable case is becaues that is a reserved
    //keyword in Java
    @ManyToOne
    @JoinColumn(name = "mystery_case_id")
    private MysteryCase mysteryCase;

    public Evidence(){

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

    public MysteryCase getMysteryCase() {
        return mysteryCase;
    }

    public void setMysteryCase(MysteryCase mysteryCase) {
        this.mysteryCase = mysteryCase;
    }
}
