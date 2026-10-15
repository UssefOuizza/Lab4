package com.example.model.tableperclass;

import javax.persistence.Entity;

@Entity
public class Livre extends Produit {

    private String nomAuteur;

    public Livre() {}

    public Livre(String designation, String nomAuteur) {
        super(designation);
        this.nomAuteur = nomAuteur;
    }

    // getters et setters
    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }
}
