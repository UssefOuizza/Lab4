package com.example.model.tableperclass;

import javax.persistence.Entity;

@Entity
public class Electronique extends Produit {

    private int dureeGarantie; // durée en mois

    public Electronique() {}

    public Electronique(String designation, int dureeGarantie) {
        super(designation);
        this.dureeGarantie = dureeGarantie;
    }

    // getters et setters
    public int getDureeGarantie() {
        return dureeGarantie;
    }

    public void setDureeGarantie(int dureeGarantie) {
        this.dureeGarantie = dureeGarantie;
    }
}
