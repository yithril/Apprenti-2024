package com.example.recipe_api_advanced.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ExitRoom {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int id;

    private String direction;

    @ManyToOne
    @JoinColumn(
            name = "game_node_id",
            nullable = false
    )
    private GameNode gameNode;

    @ManyToOne
    @JoinColumn(
            name = "target_game_node_id"
    )
    private GameNode targetGameNode;

    public ExitRoom(String direction) {
        this.direction = direction;
    }

    public ExitRoom() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public GameNode getGameNode() {
        return this.gameNode;
    }

    public void setGameNode(GameNode gameNode) {
        this.gameNode = gameNode;
    }

    public GameNode getTargetGameNode() {
        return this.targetGameNode;
    }

    public void setTargetGameNode(GameNode targetGameNode) {
        this.targetGameNode = targetGameNode;
    }
}
