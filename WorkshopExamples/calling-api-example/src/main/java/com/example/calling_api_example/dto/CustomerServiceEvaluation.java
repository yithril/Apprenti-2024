package com.example.calling_api_example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerServiceEvaluation {
    @JsonProperty("level")
    private int level; // 1 to 5 rating

    @JsonProperty("summary")
    private List<String> summary; // Bullet-point summary

    // Getters and Setters
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<String> getSummary() {
        return summary;
    }

    public void setSummary(List<String> summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "CustomerServiceEvaluation{" +
                "level=" + level +
                ", summary=" + summary +
                '}';
    }
}
