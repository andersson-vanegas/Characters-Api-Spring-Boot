package com.example.characters.Model;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "planets")
public class Planets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "planet_id")
    private Long planetId;

    private String name;

// Getters and setters


    public Long getPlanetId() {
        return planetId;
    }

    public String getName() {
        return name;
    }

    public void setPlanetId(Long planetId) {
        this.planetId = planetId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
