package com.example.restsimple.model;


public class Bahnhof {
    private Long id;
    private String name;
    private String standortStadt;
    private String standortBundesland;
    private String koordinaten;

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

    // Getter und Setter für standortStadt
    public String getStandortStadt() {
        return standortStadt;
    }

    public void setStandortStadt(String standortStadt) {
        this.standortStadt = standortStadt;
    }

    // Getter und Setter für standortBundesland
    public String getStandortBundesland() {
        return standortBundesland;
    }

    public void setStandortBundesland(String standortBundesland) {
        this.standortBundesland = standortBundesland;
    }

    // Getter und Setter für koordinaten
    public String getKoordinaten() {
        return koordinaten;
    }

    public void setKoordinaten(String koordinaten) {
        this.koordinaten = koordinaten;
    }
}
