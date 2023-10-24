package com.example.restsimple.model;

public class Kunde {
    private Long id;
    private String name;
    private String adresse;
    private String telefonnummer;
    private String email;
    private String bevorzugteZahlungsmethode;

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

    // Getter und Setter für adresse
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Getter und Setter für telefonnummer
    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    // Getter und Setter für email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter und Setter für bevorzugteZahlungsmethode
    public String getBevorzugteZahlungsmethode() {
        return bevorzugteZahlungsmethode;
    }

    public void setBevorzugteZahlungsmethode(String bevorzugteZahlungsmethode) {
        this.bevorzugteZahlungsmethode = bevorzugteZahlungsmethode;
    }
}
