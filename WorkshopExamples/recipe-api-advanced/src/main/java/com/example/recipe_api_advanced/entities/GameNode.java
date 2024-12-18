package com.example.recipe_api_advanced.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class GameNode {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int id;
    private String town;
    private String npc;
    private String monster;
    private String room;
    private String dungeon;

    @OneToMany(
            mappedBy = "gameNode",
            cascade = {CascadeType.ALL}
    )
    private List<ExitRoom> exitRooms;

    public GameNode(int id, List<ExitRoom> exitRooms) {
        this.id = id;
        this.exitRooms = exitRooms;
    }

    public GameNode(int id) {
        this.id = id;
    }

    public GameNode() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ExitRoom> getExitRooms() {
        return this.exitRooms;
    }

    public void setExitRooms(List<ExitRoom> exitRooms) {
        this.exitRooms = exitRooms;
    }
}

