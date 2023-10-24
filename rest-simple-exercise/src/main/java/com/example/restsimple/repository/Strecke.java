package com.example.restsimple.model;

public class Strecke {
    private Long id;
    private String name;
    private String standort;
    private Double koordinatenX;
    private Double koordinatenY;

    // Getter und Setter für id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter und Setter für name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter und Setter für standort
    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

    // Getter und Setter für koordinatenX
    public Double getKoordinatenX() {
        return koordinatenX;
    }

    public void setKoordinatenX(Double koordinatenX) {
        this.koordinatenX = koordinatenX;
    }

    // Getter und Setter für koordinatenY
    public Double getKoordinatenY() {
        return koordinatenY;
    }

    public void setKoordinatenY(Double koordinatenY) {
        this.koordinatenY = koordinatenY;
    }
}
