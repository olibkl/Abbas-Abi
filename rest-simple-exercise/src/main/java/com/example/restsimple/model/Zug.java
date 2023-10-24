package com.example.restsimple.model;

public class Zug {
    private Long id;
    private String zugname;
    private String zugklasse;
    private Integer maximaleSitzplatzkapazitaet;

    // Getter und Setter für id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter und Setter für zugname
    public String getZugname() {
        return zugname;
    }

    public void setZugname(String zugname) {
        this.zugname = zugname;
    }

    // Getter und Setter für zugklasse
    public String getZugklasse() {
        return zugklasse;
    }

    public void setZugklasse(String zugklasse) {
        this.zugklasse = zugklasse;
    }

    // Getter und Setter für maximaleSitzplatzkapazitaet
    public Integer getMaximaleSitzplatzkapazitaet() {
        return maximaleSitzplatzkapazitaet;
    }

    public void setMaximaleSitzplatzkapazitaet(Integer maximaleSitzplatzkapazitaet) {
        this.maximaleSitzplatzkapazitaet = maximaleSitzplatzkapazitaet;
    }
}