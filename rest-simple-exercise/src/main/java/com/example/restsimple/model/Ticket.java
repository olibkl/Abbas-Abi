package com.example.restsimple.model;

public class Ticket {
    private Long id;
    private Long kundenId;
    private Long streckenId;
    private Long zugId;
    private Double preis;
    private String gueltigkeitszeitraum;

    // Getter und Setter für id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter und Setter für kundenId
    public Long getKundenId() {
        return kundenId;
    }

    public void setKundenId(Long kundenId) {
        this.kundenId = kundenId;
    }

    // Getter und Setter für streckenId
    public Long getStreckenId() {
        return streckenId;
    }

    public void setStreckenId(Long streckenId) {
        this.streckenId = streckenId;
    }

    // Getter und Setter für zugId
    public Long getZugId() {
        return zugId;
    }

    public void setZugId(Long zugId) {
        this.zugId = zugId;
    }

    // Getter und Setter für preis
    public Double getPreis() {
        return preis;
    }

    public void setPreis(Double preis) {
        this.preis = preis;
    }

    // Getter und Setter für gueltigkeitszeitraum
    public String getGueltigkeitszeitraum() {
        return gueltigkeitszeitraum;
    }

    public void setGueltigkeitszeitraum(String gueltigkeitszeitraum) {
        this.gueltigkeitszeitraum = gueltigkeitszeitraum;
    }
}